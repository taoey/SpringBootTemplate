package com.tao.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

// 静态资源配置
@Configuration
public class WebConfig implements WebMvcConfigurer {
    /**
     * 添加静态资源文件，外部可以直接访问地址
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //需要配置1：----------- 需要告知系统，这是要被当成静态文件的！
        //第一个方法设置访问路径前缀，第二个方法设置资源路径  例如 http://127.0.0.1:8900/static/1.jpg
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
    }
}