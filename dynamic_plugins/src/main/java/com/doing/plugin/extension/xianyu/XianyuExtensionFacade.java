package com.doing.plugin.extension.xianyu;

import com.doing.plugin.BizCode;
import com.doing.plugin.domain.ExtensionContext;
import com.doing.plugin.domain.RequestData;
import com.doing.plugin.domain.ResponseData;
import com.doing.plugin.extension.ExtensionFacade;
import com.doing.plugin.extension.ModifyExtension1;
import com.doing.plugin.extension.ModifyExtension2;

/**
 * @author Doing on 19/12/2018 19:41
 */
@BizCode("xianyu")
public class XianyuExtensionFacade implements ExtensionFacade {

    @Override
    public ModifyExtension1 getModifyExtension1() {
        return new ModifyExtension1() {
            @Override
            public void process(ExtensionContext extensionContext, RequestData requestData, ResponseData responseData) {
                responseData.addData("Xianyu.modify1", "闲鱼活动优化处理流程1");
                extensionContext.getLogger().warn("Xianyu.modify1 - 闲鱼活动优化处理流程1");
                extensionContext.debug("Xianyu", "闲鱼活动优化处理流程1");
            }

        };
//        return new XianyuModifyExtension1();
    }

    @Override
    public ModifyExtension2 getModifyExtension2() {
        return new ModifyExtension2() {
            @Override
            public void process(ExtensionContext extensionContext, RequestData requestData, ResponseData responseData) {
                responseData.addData("Xianyu.modify2", "闲鱼活动优化处理流程2");
                extensionContext.getLogger().warn("Xianyu.modify2 - 闲鱼活动优化处理流程2");
                extensionContext.debug("Xianyu", "闲鱼活动优化处理流程2");


            }
        };
    }
}
