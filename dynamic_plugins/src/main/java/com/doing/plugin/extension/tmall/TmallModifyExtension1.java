package com.doing.plugin.extension.tmall;

import com.doing.plugin.extension.ModifyExtension1;

/**
 * @author Doing on 19/12/2018 19:26
 */
public class TmallModifyExtension1 implements ModifyExtension1 {

    @Override
    public void modify(String params, StringBuilder processRecord) {
        System.out.println("天猫活动优化处理流程1");
        processRecord.append("天猫活动优化处理流程1 - ");
    }
}
