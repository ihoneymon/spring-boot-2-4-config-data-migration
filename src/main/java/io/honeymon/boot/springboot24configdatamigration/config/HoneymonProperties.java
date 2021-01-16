package io.honeymon.boot.springboot24configdatamigration.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@ConfigurationProperties("honeymon")
public class HoneymonProperties {
    private String nickName;
    private String rootUri;

    @ConstructorBinding
    public HoneymonProperties(String nickName, String rootUri) {
        this.nickName = nickName;
        this.rootUri = rootUri;
    }

    public String getNickName() {
        return nickName;
    }

    public String getRootUri() {
        return rootUri;
    }
}
