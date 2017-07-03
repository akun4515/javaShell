/**
 * Project: prague.web
 * 
 * File Created at 2017年2月23日
 * $Id$
 * 
 * Copyright 2015 dface.cn Croporation Limited.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * dface Company. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with www.dface.cn
 */
package cn.dface.javaShell.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * TODO Comment of SwaggerWebConfig
 * @author akun
 *
 */
@Configuration
public class SwaggerWebConfig extends WebMvcConfigurerAdapter{
    
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");
    }
}
