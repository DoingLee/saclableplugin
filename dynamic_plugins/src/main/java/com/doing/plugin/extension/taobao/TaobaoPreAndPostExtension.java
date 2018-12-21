package com.doing.plugin.extension.taobao;

import com.doing.plugin.extension.PreAndPostExtension;

/**
 * @author Doing on 19/12/2018 15:38
 */
public class TaobaoPreAndPostExtension implements PreAndPostExtension {

    @Override
    public void beforeProcess(String params, StringBuilder processRecord) {
        System.out.println("淘宝活动前置处理流程");
        processRecord.append("淘宝活动前置处理流程 - ");
    }

    @Override
    public void afterProcess(String params, StringBuilder processRecord) {
        System.out.println("淘宝活动后置处理流程");
        processRecord.append("淘宝活动后置处理流程");
    }
}
