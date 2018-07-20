package com.lost.izalith.headstone.dozer.dto;

import lombok.Data;

@Data
public class HeadstoneSimpleRequest {

    private String name;

    private String key;

    private String value;

    private String someEnum;

    private String dataString;
}
