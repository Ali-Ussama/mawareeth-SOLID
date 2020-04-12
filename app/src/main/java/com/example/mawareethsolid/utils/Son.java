package com.example.mawareethsolid.utils;

import com.example.mawareethsolid.pojo.Relations;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.inject.Qualifier;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Qualifier
@Documented
@Retention(RUNTIME)
public @interface Son {

    /** The name. */
    String value() default Relations.PERSON_SON;
}
