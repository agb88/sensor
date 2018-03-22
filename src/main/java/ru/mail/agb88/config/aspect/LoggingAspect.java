package ru.mail.agb88.config.aspect;
/**
 * Created by AlexBal 23.11.2017
 */

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.Aspect;

import java.util.Arrays;


@Aspect
@Component
public class LoggingAspect {
    private static final Logger logger = Logger.getLogger(LoggingAspect.class);

    @Around("!(within(ru.mail.agb88.config..*)) && within(ru.mail.agb88..*)")
    public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info("start method: " + joinPoint.getSignature().getName() + " with arguments: " + Arrays.toString(joinPoint.getArgs()));
        Object obj = joinPoint.proceed(); //continue on the intercepted method
        logger.info("end method: " + joinPoint.getSignature().getName() + " with result: " + (obj != null ? obj.toString() : "[not reproducible]"));
        logger.info("--------------------------------------------------------------");
        return obj;
    }
}
