package com.webwithnew.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * created on 2019/3/8 14:33
 *
 * @author zhangalong
 */
public class SpitterWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        //返回带有@Configuration注解的类将会用来配置ContextLoaderListener创建应用上下文中的bean
        return new Class<?>[] { RootConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        //返回带有@Configuration注解的类将会用来定义DispatcherServlet应用上下文中的bean
        return new Class<?>[] { WebConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        //将DispatcherServlet映射到"/"
        return new String[]{"/"};
    }
}
