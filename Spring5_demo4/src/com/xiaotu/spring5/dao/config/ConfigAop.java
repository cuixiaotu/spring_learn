package com.xiaotu.spring5.dao.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"com.xiaotu"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ConfigAop {

}
