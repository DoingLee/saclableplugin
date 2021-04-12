package com.doing.plugin2.extension;

import com.doing.biz.ActivitySimpleExt;
import com.doing.biz.domain.ExtensionContext;
import com.doing.biz.domain.RequestData;
import com.doing.biz.domain.ResponseData;
import com.doing.container.sdk.CloudBean;
import com.doing.plugin.extension.taobao.service.TestService;
import org.springframework.beans.factory.annotation.Value;

import javax.annotation.Resource;

@CloudBean(key = "jdActivitySimpleExt", description = "京东简单扩展点")
public class JdActivitySimpleExt implements ActivitySimpleExt {

    @Resource
    private TestService testService;

//    @Value("${test.version}")
//    private String testVersion;

    @Override
    public ResponseData simpleProcess(ExtensionContext extensionContext, RequestData requestData) {
        ResponseData responseData = new ResponseData();
        responseData.addData("Jd.simpleProcess", "京东活动简单处理流程 19:40");



        requestData.addData("testService result", testService.test());
//        if (null != testVersion) {
//            requestData.addData("testVersion property", testVersion);
//        } else {
//            requestData.addData("testVersion property", "null");
//        }

        extensionContext.getLogger().warn("Jd.simpleProcess - 京东活动简单处理流程 19:40");
        extensionContext.debug("Jd", "京东活动简单处理流程 19:40");
        return responseData;
    }
}
