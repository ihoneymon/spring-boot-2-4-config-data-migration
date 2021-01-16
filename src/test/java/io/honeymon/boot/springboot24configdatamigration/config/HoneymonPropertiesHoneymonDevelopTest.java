package io.honeymon.boot.springboot24configdatamigration.config;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ActiveProfiles({"honeymon-develop"})
class HoneymonPropertiesHoneymonDevelopTest {
    @Autowired
    HoneymonProperties honeymonProperties;

    @Test
    @DisplayName("honeymon-develop 프로파일 정의")
    void test01() {
        assertThat(honeymonProperties.getRootUri()).isEqualTo("http://honeymon.io");
        assertThat(honeymonProperties.getNickName()).isEqualTo("Developer Honeymon");
    }
}