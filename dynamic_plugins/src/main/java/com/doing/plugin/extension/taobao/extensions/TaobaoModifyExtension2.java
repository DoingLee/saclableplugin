package com.doing.plugin.extension.taobao.extensions;

import com.doing.plugin.domain.ExtensionContext;
import com.doing.plugin.domain.RequestData;
import com.doing.plugin.domain.ResponseData;
import com.doing.plugin.extension.ModifyExtension2;
import com.doing.plugin.extension.taobao.service.TestService;


/**
 * @author Doing on 19/12/2018 19:26
 */
public class TaobaoModifyExtension2 extends ModifyExtension2 {

    private TestService testService;

    @Override
    public void init() {
        testService = (TestService) getApplicationContext().getBean("testService");
    }

    @Override
    public void process(ExtensionContext extensionContext, RequestData requestData, ResponseData responseData) {
        responseData.addData("Taobao.modify2", "淘宝活动优化处理流程2. spring testService.test()=" + testService.test());
        extensionContext.getLogger().warn("Taobao.modify2 - 淘宝活动优化处理流程2. spring testService.test()={}", testService.test());
        extensionContext.debug("Taobao", "淘宝活动优化处理流程2. spring testService.test()={}", testService.test());

    }
}
