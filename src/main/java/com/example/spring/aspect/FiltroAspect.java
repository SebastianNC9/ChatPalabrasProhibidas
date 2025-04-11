package com.example.spring.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class FiltroAspect {

    @Around("execution(* com.ejemplo.mensajes.service.FiltroPalabrasService.procesarMensaje(..))")
    public Object revisarYReemplazar(ProceedingJoinPoint joinPoint) throws Throwable {
        Object[] args = joinPoint.getArgs();
        String mensajeOriginal = (String) args[0];
        System.out.println("Mensaje recibido: " + mensajeOriginal);
        Object resultado = joinPoint.proceed();
        System.out.println("Mensaje procesado: " + resultado);
        return resultado;
    }
}
