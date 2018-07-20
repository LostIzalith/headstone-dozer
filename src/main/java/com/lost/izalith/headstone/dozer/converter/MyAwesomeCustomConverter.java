package com.lost.izalith.headstone.dozer.converter;

import com.lost.izalith.headstone.dozer.service.MyAwesomeService;
import lombok.RequiredArgsConstructor;
import org.dozer.CustomConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class MyAwesomeCustomConverter implements CustomConverter {

    private final MyAwesomeService myAwesomeService;

    @Override
    public Object convert(final Object existingDestinationFieldValue,
                          final Object sourceFieldValue,
                          final Class<?> destinationClass,
                          final Class<?> sourceClass) {

        return myAwesomeService.awesomeString();
    }
}
