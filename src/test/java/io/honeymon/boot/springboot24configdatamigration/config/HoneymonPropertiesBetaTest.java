package io.honeymon.boot.springboot24configdatamigration.config;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ActiveProfiles({"beta"})
class HoneymonPropertiesBetaTest {
    @Autowired
    HoneymonProperties honeymonProperties;

    @Test
    @DisplayName("beta 프로파일 선언")
    void test01() {
        assertThat(honeymonProperties.getRootUri()).isEqualTo("http://honeymon.beta.io");
        assertThat(honeymonProperties.getNickName()).isEqualTo("Beta tester Honeymon");
    }
}