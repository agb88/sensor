package ru.mail.agb88.controller.config.initializer;

import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import ru.mail.agb88.controller.config.AppConfig;

import javax.servlet.Filter;

/**
 * Spring Initializer class
 * Created by AlexBal
 */
public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

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

    /**
     * Changes Spring profile.
     */
    /*@Override
    protected WebApplicationContext createRootApplicationContext() {
        WebApplicationContext context = super.createRootApplicationContext();
        ((ConfigurableEnvironment) context.getEnvironment()).setActiveProfiles("heroku");

        return context;
    }*/
}
