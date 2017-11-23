package ru.mail.agb88.controller.config.initializer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import ru.mail.agb88.controller.config.AppConfig;

import javax.servlet.Filter;

/**
 * Spring Initializer class
 * Created by AlexBal
 */
public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    private static final String LOCATION = "D:/opt/images/";
    private static final long MAX_FILE_SIZE = 1024 * 1024 * 2;

    @Autowired
    MessageSource msg;

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{AppConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return null;
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    @Override
    protected Filter[] getServletFilters() {
        return new Filter[]{new CharacterEncodingFilter("UTF-8", true)};
    }
}
