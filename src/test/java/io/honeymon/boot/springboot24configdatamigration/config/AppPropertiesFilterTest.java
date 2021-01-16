package io.honeymon.boot.springboot24configdatamigration.config;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.time.Duration;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@ActiveProfiles({"filter"})
@SpringBootTest
class AppPropertiesFilterTest {
    @Autowired
    AppProperties appProperties;

    /**
     * 필터는
     */
    @Test
    void test() {
        // spring.config.activate.on-profile: filter 선언된 문서를 지나 마지막 선언된 속성값으로 덮어쓰기 된다.
        assertThat(appProperties.getDurationField()).isEqualTo(Duration.ofHours(5L));
        // application.yml 제일 마지막 속성값으로 덮어쓰기 된다.
        assertThat(appProperties.getName()).isEqualTo("Override Override Spring Config Data Migration guide");
    }
}