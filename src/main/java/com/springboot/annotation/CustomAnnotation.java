package com.springboot.annotation;

import jakarta.validation.Constraint;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface CustomAnnotation {
}
