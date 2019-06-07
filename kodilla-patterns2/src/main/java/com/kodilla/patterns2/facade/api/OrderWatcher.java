package com.kodilla.patterns2.facade.api;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class OrderWatcher {
    private static final Logger LOGGER = LoggerFactory.getLogger(OrderWatcher.class);



    @Before("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))")
    public void logEvent(){
        LOGGER.info("Beginning of processOrder() method execution...");
    }

    @AfterReturning("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))" +
            "&& args(order, userId) && target(object)")
    public void logEventBefore(OrderDto order, Long userId, Object object){
        LOGGER.info("Method processOrder() was executed (on object class: " + object.getClass().getName() + "). Number of items in order: " + order.getItems().size()
                + ", User ID: " + userId);
    }

    @Around("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))")
    public Object measureTimeOfProcessing(final ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object result;
        try {
            long beginOfTime = System.currentTimeMillis();
            result = proceedingJoinPoint.proceed();
            long endOfTime = System.currentTimeMillis();
            LOGGER.info("Time consumed by method processOrder(): " + (endOfTime - beginOfTime) + "[ms]");
        } catch (Throwable throwable) {
            LOGGER.error(throwable.getMessage());
            throw throwable;
        }
        return result;
    }
}

