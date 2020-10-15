package kr.ensueno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class EnsuenoAspect {

    @Around("execution(@kr.ensueno.annotation.EnsuenoLog * *(..))")
    public Object aroundAspect(ProceedingJoinPoint pjp) throws Throwable {

        long startTime = System.currentTimeMillis();
        System.out.println("Starting " + pjp.getSignature().getName());
        Object proceed = pjp.proceed();
        System.out.println("Method execution completed");
        long endTime = System.currentTimeMillis();
        System.out.println("Execution completion time is -- " + endTime + " ms");

        return proceed;
    }

}
