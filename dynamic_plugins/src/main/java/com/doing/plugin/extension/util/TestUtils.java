package com.doing.plugin.extension.util;

import com.alibaba.fastjson.JSONObject;

public class TestUtils {

    public static Activity getTestActivity() {
        // 测试使用仅在扩展脚本依赖进来的第三方包
        String jsonString = "{\"name\":\"活动A\"}";
        Activity activity = JSONObject.parseObject(jsonString, Activity.class);
        return activity;
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
