package io.honeymon.boot.springboot24configdatamigration.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

import java.time.Duration;

@ConfigurationProperties("app")
public class AppProperties {
    private String name;
    private Duration durationField;

    @ConstructorBinding
    public AppProperties(String name, Duration durationField) {
        this.name = name;
        this.durationField = durationField;
    }

    public String getName() {
        return name;
    }

    public Duration getDurationField() {
        return durationField;
    }
}
