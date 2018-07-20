package com.lost.izalith.headstone.dozer.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class HeadstoneSimpleResponse {

    @JsonProperty(value = "name")
    private String awesomeName;

    private String key;

    private String value;

    private String someAction;

    private String myAwesomeString;
}
