package com.doing.plugin.extension.util;

import com.google.gson.Gson;

public class TestUtils {

    public static Activity getTestActivity() {
        // 测试使用仅在扩展脚本依赖进来的第三方包Gson
        Gson gson = new Gson();
        String jsonString = "{\"name\":\"活动A\"}";
        Activity activity = gson.fromJson(jsonString, Activity.class);
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
