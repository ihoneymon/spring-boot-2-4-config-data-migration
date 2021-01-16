package io.honeymon.boot.springboot24configdatamigration.config;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class HoneymonPropertiesTest {
    @Autowired
    HoneymonProperties honeymonProperties;

    @Test
    @DisplayName("프로파일을 선언하지 않았다면!!")
    void test01() {
        assertThat(honeymonProperties.getRootUri()).isEqualTo("http://honeymon.io");
        assertThat(honeymonProperties.getNickName()).isEqualTo("Honeymon");
    }
}