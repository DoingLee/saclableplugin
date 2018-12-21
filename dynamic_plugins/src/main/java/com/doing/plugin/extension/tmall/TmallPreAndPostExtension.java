package com.doing.plugin.extension.tmall;

import com.doing.plugin.extension.PreAndPostExtension;

/**
 * @author Doing on 19/12/2018 15:38
 */
public class TmallPreAndPostExtension implements PreAndPostExtension {

    @Override
    public void beforeProcess(String params, StringBuilder processRecord) {
        System.out.println("天猫活动前置处理流程");
        processRecord.append("天猫活动前置处理流程 - ");
    }

    @Override
    public void afterProcess(String params, StringBuilder processRecord) {
        System.out.println("天猫活动后置处理流程");
        processRecord.append("天猫活动后置处理流程");
    }
}
