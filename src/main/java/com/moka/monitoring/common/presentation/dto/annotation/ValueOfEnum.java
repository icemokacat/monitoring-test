package com.moka.monitoring.common.presentation.dto.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.moka.monitoring.common.presentation.validator.ValueOfEnumValidator;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = ValueOfEnumValidator.class)
public @interface ValueOfEnum {
	Class<? extends Enum<?>> enumClass();
	String message() default "Invalid enum value";
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default {};
}
