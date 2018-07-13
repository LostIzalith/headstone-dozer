package com.lost.izalith.headstone.dozer.mapping;

import com.lost.izalith.headstone.dozer.domain.HeadstoneSimpleEntity;
import com.lost.izalith.headstone.dozer.dto.HeadstoneSimpleRequest;
import org.dozer.loader.api.BeanMappingBuilder;
import org.dozer.loader.api.TypeMappingOptions;

public class SimpleRequest2SimpleEntity extends BeanMappingBuilder {

    @Override
    protected void configure() {
        mapping(HeadstoneSimpleRequest.class, HeadstoneSimpleEntity.class, TypeMappingOptions.oneWay())
                .fields("name", "name")
                .fields("key", "key")
                .fields("value", "value");
    }
}
