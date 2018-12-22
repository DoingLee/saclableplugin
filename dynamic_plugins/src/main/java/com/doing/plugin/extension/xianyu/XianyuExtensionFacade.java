package com.doing.plugin.extension.xianyu;

import com.doing.plugin.BizCode;
import com.doing.plugin.extension.ExtensionFacade;
import com.doing.plugin.extension.ModifyExtension1;
import com.doing.plugin.extension.ModifyExtension2;
import com.doing.plugin.extension.PreAndPostExtension;

/**
 * @author Doing on 19/12/2018 19:41
 */
@BizCode("xianyu")
public class XianyuExtensionFacade implements ExtensionFacade {

    @Override
    public PreAndPostExtension getPreAndPostExtension() {
        return new PreAndPostExtension() {
            @Override
            public void beforeProcess(String params, StringBuilder processRecord) {
                System.out.println("闲鱼活动前置处理流程");
                processRecord.append("京东活动前置处理流程 - ");
            }

            @Override
            public void afterProcess(String params, StringBuilder processRecord) {
                System.out.println("闲鱼活动后置处理流程");
                processRecord.append("京东活动后置处理流程");

            }
        };
    }

    @Override
    public ModifyExtension1 getModifyExtension1() {
        return new ModifyExtension1() {
            @Override
            public void modify(String params, StringBuilder processRecord) {
                System.out.println("闲鱼活动优化处理流程1");
                processRecord.append("闲鱼活动优化处理流程1 - ");
            }
        };
    }

    @Override
    public ModifyExtension2 getModifyExtension2() {
        return new ModifyExtension2() {
            @Override
            public void modify(String params, StringBuilder processRecord) {
                System.out.println("闲鱼活动优化处理流程2");
                processRecord.append("闲鱼活动优化处理流程2 - ");
            }
        };
    }
}
