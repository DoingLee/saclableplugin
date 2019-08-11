package com.doing.plugin.extension.taobao;

import com.doing.plugin.plugin.domain.ExtensionContext;
import com.doing.plugin.plugin.domain.RequestData;
import com.doing.plugin.plugin.domain.ResponseData;
import com.doing.plugin.plugin.extension.ModifyExtension2;

import javax.annotation.Resource;


/**
 * @author Doing on 19/12/2018 19:26
 */
public class TaobaoModifyExtension2 implements ModifyExtension2 {

    @Resource(name = "xmlStringBean1")
    String xmlStringBean1;

    @Override
    public void modify(ExtensionContext extensionContext, RequestData requestData, ResponseData responseData) {
        responseData.addData("Taobao.modify2", "淘宝活动优化处理流程2=" + xmlStringBean1);
        extensionContext.getLogger().warn("Taobao.modify2 - 淘宝活动优化处理流程2={}", xmlStringBean1);
        extensionContext.debug("Taobao", "淘宝活动优化处理流程2={}", xmlStringBean1);

    }
}
