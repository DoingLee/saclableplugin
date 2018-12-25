package com.doing.plugin.extension.taobao;

import com.doing.plugin.extension.ModifyExtension2;

import javax.annotation.Resource;


/**
 * @author Doing on 19/12/2018 19:26
 */
public class TaobaoModifyExtension2 implements ModifyExtension2 {

    @Resource(name = "xmlStringBean1")
    String xmlStringBean1;

    @Override
    public void modify(String params, StringBuilder processRecord) {
        System.out.println("淘宝活动优化处理流程2 : " + xmlStringBean1);
        processRecord.append("淘宝活动优化处理流程2 : " + xmlStringBean1 + " - ");

    }
}
