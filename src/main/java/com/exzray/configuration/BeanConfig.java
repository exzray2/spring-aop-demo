package com.exzray.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"com.exzray.model", "com.exzray.aop"})
@EnableAspectJAutoProxy
public class BeanConfig {
}
