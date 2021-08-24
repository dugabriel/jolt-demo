package com.totvs.jolt.controller;

import com.totvs.jolt.service.JoltService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JoltController {

    @Autowired
    private JoltService joltService;

    @PostMapping("/transform")
    public TransformDTO joltTransform(@RequestBody TransformDTO transformDTO) throws Exception {
        return joltService.transformJsonWithJoltSpec(transformDTO);
    }

}
