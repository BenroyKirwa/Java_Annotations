package com.entityinfo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD})
public @interface EntityInfo {

    // Annotation properties
    String label();
    EntityType entityType();
    DataType dataType() default DataType.NONE;
}
