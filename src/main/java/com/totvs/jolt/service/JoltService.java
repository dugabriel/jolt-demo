package com.totvs.jolt.service;

import com.bazaarvoice.jolt.Chainr;
import com.bazaarvoice.jolt.JsonUtils;
import com.totvs.jolt.controller.TransformDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JoltService {

    public TransformDTO transformJsonWithJoltSpec(TransformDTO transformDTO) {
        List<Object> chainrSpecJSON = JsonUtils.jsonToList(transformDTO.getSpec());
        Chainr chainr = Chainr.fromSpec(chainrSpecJSON);

        Object inputJSON = JsonUtils.jsonToObject(transformDTO.getInput());
        Object transformedOutput = chainr.transform(inputJSON);
        return transformDTO.setResult(JsonUtils.toJsonString(transformedOutput));
    }
}
