package com.lost.izalith.headstone.dozer.controller;

import com.lost.izalith.headstone.dozer.domain.HeadstoneSimpleEntity;
import com.lost.izalith.headstone.dozer.dto.HeadstoneSimpleRequest;
import com.lost.izalith.headstone.dozer.dto.HeadstoneSimpleResponse;
import lombok.RequiredArgsConstructor;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;

@RestController
@RequestMapping("/headstone")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class HeadstoneController {

    private final DozerBeanMapper dozerBeanMapper;

    @PostMapping("/request")
    public ResponseEntity<HeadstoneSimpleResponse> whateverIWantPost(
            final @Valid @RequestBody HeadstoneSimpleRequest simpleRequest,
            final UriComponentsBuilder uriComponentsBuilder) {

        final UriComponents uriComponents = uriComponentsBuilder.path("/headstone/request").build();

        final HeadstoneSimpleEntity simpleEntity = dozerBeanMapper.map(simpleRequest, HeadstoneSimpleEntity.class);

        final HeadstoneSimpleResponse response = dozerBeanMapper.map(simpleEntity, HeadstoneSimpleResponse.class);

        return ResponseEntity.created(uriComponents.toUri())
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .body(response);
    }
}
