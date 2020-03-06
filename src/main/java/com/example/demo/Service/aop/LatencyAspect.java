package com.example.demo.Service.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by maysam.mokarian on 12/1/2017.
 */
@Aspect
@Component
public class LatencyAspect {
    private final Logger logger = LoggerFactory.getLogger(LatencyAspect.class);

    @Around("@annotation(Latency)")
    public Object logExecutionTime(final ProceedingJoinPoint joinPoint) throws Throwable {
        final long start = System.currentTimeMillis();

        final Object proceed = joinPoint.proceed();

        log(System.currentTimeMillis() - start, joinPoint.getSignature().toString());

        return proceed;
    }

    protected void log(final long executionTime, final String signature) {
        this.logger.info(signature + ", EXECUTED_IN(ms), " + executionTime);
    }

}
