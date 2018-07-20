package com.lost.izalith.headstone.dozer.mapping;

import com.lost.izalith.headstone.dozer.converter.MyAwesomeCustomConverter;
import com.lost.izalith.headstone.dozer.converter.SomeEnumConverter;
import com.lost.izalith.headstone.dozer.domain.HeadstoneSimpleEntity;
import com.lost.izalith.headstone.dozer.dto.HeadstoneSimpleRequest;
import org.dozer.loader.api.BeanMappingBuilder;
import org.dozer.loader.api.FieldsMappingOptions;
import org.dozer.loader.api.TypeMappingOptions;

import static org.dozer.loader.api.FieldsMappingOptions.customConverterId;

public class SimpleRequest2SimpleEntity extends BeanMappingBuilder {

    @Override
    protected void configure() {
        mapping(HeadstoneSimpleRequest.class, HeadstoneSimpleEntity.class, TypeMappingOptions.oneWay())
                .fields("name", "name")
                .fields("key", "key")
                .fields("value", "value")
                .fields("someEnum", "someEnum", FieldsMappingOptions.customConverter(SomeEnumConverter.class))
                .fields("dataString", "myAwesomeString", customConverterId(
                        MyAwesomeCustomConverter.class.getSimpleName()
                ));
    }
}
