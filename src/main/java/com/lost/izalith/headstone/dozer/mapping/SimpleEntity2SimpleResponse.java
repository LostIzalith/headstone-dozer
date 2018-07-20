package com.lost.izalith.headstone.dozer.mapping;

import com.lost.izalith.headstone.dozer.domain.HeadstoneSimpleEntity;
import com.lost.izalith.headstone.dozer.dto.HeadstoneSimpleResponse;
import org.dozer.loader.api.BeanMappingBuilder;
import org.dozer.loader.api.TypeMappingOptions;

public class SimpleEntity2SimpleResponse extends BeanMappingBuilder {

    @Override
    protected void configure() {
        mapping(HeadstoneSimpleEntity.class, HeadstoneSimpleResponse.class, TypeMappingOptions.oneWay())
                .fields("name", "awesomeName")
                .fields("key", "key")
                .fields("value", "value")
                .fields("someEnum", "someAction");
    }
}
