package com.app.aspect.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
@Slf4j
public class DivisionAspect {
    @Around("@annotation(com.app.aspect.aspect.annotation.LogStatus)")
    public Integer around(ProceedingJoinPoint proceedingJoinPoint){
        log.info("poin cut: {}", proceedingJoinPoint);
        Integer result = 0;

        try {
            result = (Integer)proceedingJoinPoint.proceed();
        }catch (NumberFormatException e){
            log.info("잘못된 입력 값");
        }catch (Throwable throwable){
            throwable.printStackTrace();
        }
        return result;
    }
}
