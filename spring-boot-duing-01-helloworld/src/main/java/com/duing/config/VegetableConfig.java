package com.duing.config;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 *
 *
 * vegetable.potato=西红柿
 * vegetable.eggplate=茄子
 * vegetable.greenpeper=青椒
 */

@Configuration
@ConfigurationProperties(prefix = "vegetable")
@PropertySource("classpath:config/vegetable.properties")
@Data
public class VegetableConfig {

    private String potato;
    private String eggplate;
    private String greenpeper;

}
