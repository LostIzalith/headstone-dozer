package com.lost.izalith.headstone.dozer.converter;

import com.lost.izalith.headstone.dozer.domain.SomeEnum;
import org.dozer.CustomConverter;

import java.util.Optional;

public class SomeEnumConverter implements CustomConverter {

    @Override
    public Object convert(final Object existingDestinationFieldValue,
                          final Object sourceFieldValue,
                          final Class<?> destinationClass,
                          final Class<?> sourceClass) {

        return Optional.ofNullable(sourceFieldValue)
                .map(e -> SomeEnum.ITEMS
                        .stream()
                        .filter(x -> x.getClientValue().equalsIgnoreCase(e.toString()))
                        .findAny()
                        .orElseThrow(() -> new IllegalArgumentException("Incorrect enum value " + e + ". "
                                + "Possible values are " + SomeEnum.ITEMS)))
                .orElse(null);
    }
}
