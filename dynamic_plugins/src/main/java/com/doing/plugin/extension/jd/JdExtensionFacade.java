package com.doing.plugin.extension.jd;

import com.doing.plugin.BizCode;
import com.doing.plugin.plugin.domain.ExtensionContext;
import com.doing.plugin.plugin.domain.RequestData;
import com.doing.plugin.plugin.domain.ResponseData;
import com.doing.plugin.plugin.extension.ExtensionFacade;
import com.doing.plugin.plugin.extension.ModifyExtension1;
import com.doing.plugin.plugin.extension.ModifyExtension2;
import com.doing.plugin.plugin.extension.PreAndPostExtension;

/**
 * @author Doing on 19/12/2018 19:41
 */
@BizCode("jd")
public class JdExtensionFacade implements ExtensionFacade {

    @Override
    public PreAndPostExtension getPreAndPostExtension() {
        return new PreAndPostExtension() {
            @Override
            public void beforeProcess(ExtensionContext extensionContext, RequestData requestData, ResponseData responseData) {
                responseData.addData("Jd.pre", "京东活动前置处理流程");
                extensionContext.getLogger().warn("Jd.pre - 京东活动前置处理流程");
                extensionContext.debug("Jd", "京东活动前置处理流程");
            }

            @Override
            public void afterProcess(ExtensionContext extensionContext, RequestData requestData, ResponseData responseData) {
                responseData.addData("Jd.after", "京东活动后置处理流程");
                extensionContext.getLogger().warn("Jd.after - 京东活动后置处理流程");
                extensionContext.debug("Jd", "京东活动后置处理流程");
            }
        };
//        return new JdPreAndPostExtension();
    }

    @Override
    public ModifyExtension1 getModifyExtension1() {
        return new ModifyExtension1() {
            @Override
            public void modify(ExtensionContext extensionContext, RequestData requestData, ResponseData responseData) {
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
            public void modify(ExtensionContext extensionContext, RequestData requestData, ResponseData responseData) {
                responseData.addData("Jd.modify2", "京东活动优化处理流程2");
                extensionContext.getLogger().warn("Jd.modify2 - 京东活动优化处理流程2");
                extensionContext.debug("Jd", "京东活动优化处理流程2");
            }
        };
//        return new JdModifyExtension2();
    }
}
