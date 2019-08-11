package com.doing.plugin.extension.taobao;

import com.doing.plugin.plugin.domain.ExtensionContext;
import com.doing.plugin.plugin.domain.RequestData;
import com.doing.plugin.plugin.domain.ResponseData;
import com.doing.plugin.plugin.extension.ModifyExtension1;
import com.google.gson.Gson;

/**
 * @author Doing on 19/12/2018 19:26
 */
public class TaobaoModifyExtension1 implements ModifyExtension1 {

    @Override
    public void modify(ExtensionContext extensionContext, RequestData requestData, ResponseData responseData) {
        // 测试使用仅在扩展脚本依赖进来的第三方包Gson
        Gson gson = new Gson();
        String jsonString = "{\"name\":\"活动A\"}";
        Activity activity = gson.fromJson(jsonString, Activity.class);

        responseData.addData("Taobao.modify1", "淘宝活动优化处理流程1=" + activity.getName());
        extensionContext.getLogger().warn("Taobao.modify1 - 淘宝活动优化处理流程1={}", activity.getName());
        extensionContext.debug("Taobao", "淘宝活动优化处理流程1={}", activity.getName());
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
