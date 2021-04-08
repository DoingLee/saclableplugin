package com.doing.plugin.extension.taobao.service;

public class TestService {

    private String testVersion;

    public String test() {
        return "success in Spring container";
    }

    public String getTestVersion() {
        return testVersion;
    }

    public void setTestVersion(String testVersion) {
        this.testVersion = testVersion;
    }
}
