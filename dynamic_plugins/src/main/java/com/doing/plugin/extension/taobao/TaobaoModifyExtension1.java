package com.doing.plugin.extension.taobao;

import com.alibaba.fastjson.JSONObject;
import com.doing.plugin.domain.ExtensionContext;
import com.doing.plugin.domain.RequestData;
import com.doing.plugin.domain.ResponseData;
import com.doing.plugin.extension.ModifyExtension1;

/**
 * @author Doing on 19/12/2018 19:26
 */
public class TaobaoModifyExtension1 implements ModifyExtension1 {

    @Override
    public void modify(ExtensionContext extensionContext, RequestData requestData, ResponseData responseData) {
        // 测试使用仅在扩展脚本依赖进来的第三方包Gson
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "测试活动名称");

        responseData.addData("Taobao.modify1", "新淘宝活动优化处理流程1=" + jsonObject.getString("name"));
        extensionContext.getLogger().warn("Taobao.modify1 - 新淘宝活动优化处理流程1={}", jsonObject.getString("name"));
        extensionContext.debug("Taobao", "新淘宝活动优化处理流程1={}", jsonObject.getString("name"));
    }

    public static class Activity {
        String name;

        public Activity() {
        }

        public Activity(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
