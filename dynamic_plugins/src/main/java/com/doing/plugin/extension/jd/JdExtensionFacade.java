package com.doing.plugin.extension.jd;

import com.doing.plugin.BizCode;
import com.doing.plugin.domain.ExtensionContext;
import com.doing.plugin.domain.RequestData;
import com.doing.plugin.domain.ResponseData;
import com.doing.plugin.extension.*;

/**
 * @author Doing on 19/12/2018 19:41
 */
@BizCode("jd")
public class JdExtensionFacade implements ExtensionFacade {


    @Override
    public ModifyExtension1 getModifyExtension1() {
        return new ModifyExtension1() {
            @Override
            public void process(ExtensionContext extensionContext, RequestData requestData, ResponseData responseData) {
                responseData.addData("Jd.modify1", "京东活动优化处理流程1");
                extensionContext.getLogger().warn("Jd.modify1 - 京东活动优化处理流程1");
                extensionContext.debug("Jd", "京东活动优化处理流程1");
            }

        };
//        return new JdModifyExtension1();
    }

    @Override
    public ModifyExtension2 getModifyExtension2() {
        return new ModifyExtension2() {
            @Override
            public void process(ExtensionContext extensionContext, RequestData requestData, ResponseData responseData) {
                responseData.addData("Jd.modify2", "京东活动优化处理流程2");
                extensionContext.getLogger().warn("Jd.modify2 - 京东活动优化处理流程2");
                extensionContext.debug("Jd", "京东活动优化处理流程2");
            }
        };
//        return new JdModifyExtension2();
    }
}
