package com.duing.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "food")
public class FoodConfig {

    private String rice;
    private String meat;
    private String sauce;
}
