package io.honeymon.boot.springboot24configdatamigration.config;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.Duration;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class AppPropertiesTest {
    @Autowired
    AppProperties appProperties;

    @Test
    void test() {
        assertThat(appProperties.getName()).isEqualTo("Override Override Spring Config Data Migration guide");
        assertThat(appProperties.getDurationField()).isEqualTo(Duration.ofHours(5L));
    }
}