package com.doing.plugin.extension.taobao;

import com.doing.plugin.domain.ExtensionContext;
import com.doing.plugin.domain.RequestData;
import com.doing.plugin.domain.ResponseData;
import com.doing.plugin.extension.ModifyExtension2;

import javax.annotation.Resource;


/**
 * @author Doing on 19/12/2018 19:26
 */
public class TaobaoModifyExtension2 extends ModifyExtension2 {

    @Resource(name = "xmlStringBean1")
    String xmlStringBean1;

    public TaobaoModifyExtension2() {

    }

    @Override
    public void process(ExtensionContext extensionContext, RequestData requestData, ResponseData responseData) {
        responseData.addData("Taobao.modify2", "淘宝活动优化处理流程2=" + xmlStringBean1);
        extensionContext.getLogger().warn("Taobao.modify2 - 淘宝活动优化处理流程2={}", xmlStringBean1);
        extensionContext.debug("Taobao", "淘宝活动优化处理流程2={}", xmlStringBean1);

    }
}
