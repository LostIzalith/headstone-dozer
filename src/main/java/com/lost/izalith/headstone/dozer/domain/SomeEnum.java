package com.lost.izalith.headstone.dozer.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;

@Getter
@RequiredArgsConstructor
public enum SomeEnum {

    START("start"),

    FINISH("finish"),

    PROCESS("process"),

    SOME_OTHER_ACTION("some_other_action");

    public static final List<SomeEnum> ITEMS = unmodifiableList(asList(values()));

    private final String clientValue;
}
