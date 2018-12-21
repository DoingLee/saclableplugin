package com.doing.plugin.extension.mogu;

import com.doing.plugin.extension.ModifyExtension1;

/**
 * @author Doing on 19/12/2018 19:26
 */
public class MoguModifyExtension1 implements ModifyExtension1 {

    @Override
    public void modify(String params, StringBuilder processRecord) {
        System.out.println("蘑菇街活动优化处理流程1");
        processRecord.append("蘑菇街活动优化处理流程1 - ");
    }
}
