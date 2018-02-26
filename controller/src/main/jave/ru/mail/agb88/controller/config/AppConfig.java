package ru.mail.agb88.controller.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Scanning all project
 * Created by AlexBal
 */
@Configuration
@ComponentScan("ru.mail.agb88")
@EnableAspectJAutoProxy
public class AppConfig {
}
