package com.totvs.jolt.controller;

public class TransformDTO {

    private String input;

    private String spec;

    private String result;

    public String getInput() {
        return input;
    }

    public TransformDTO setInput(String input) {
        this.input = input;
        return this;
    }

    public String getSpec() {
        return spec;
    }

    public TransformDTO setSpec(String spec) {
        this.spec = spec;
        return this;
    }

    public String getResult() {
        return result;
    }

    public TransformDTO setResult(String result) {
        this.result = result;
        return this;
    }

    @Override
    public String toString() {
        return "TransformDTO{" +
                "input='" + input + '\'' +
                ", spec='" + spec + '\'' +
                ", result='" + result + '\'' +
                '}';
    }
}
