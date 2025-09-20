package com.moka.monitoring.common.presentation.validator;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.moka.monitoring.common.presentation.dto.annotation.ValueOfEnum;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValueOfEnumValidator implements ConstraintValidator<ValueOfEnum, String> {
	private List<String> acceptedValues;

	@Override
	public void initialize(ValueOfEnum annotation) {
		acceptedValues = Stream.of(annotation.enumClass().getEnumConstants())
			.map(Enum::name)
			.collect(Collectors.toList());
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if (value == null) return true;
		return acceptedValues.contains(value.toUpperCase());
	}
}
