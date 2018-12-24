package com.doing.plugin.extension.taobao;

import com.doing.plugin.extension.ModifyExtension1;
import com.google.gson.Gson;

/**
 * @author Doing on 19/12/2018 19:26
 */
public class TaobaoModifyExtension1 implements ModifyExtension1 {

    @Override
    public void modify(String params, StringBuilder processRecord) {
        Gson gson = new Gson();
        String jsonString = "{\"name\":\"活动A\"}";
        Activity activity = gson.fromJson(jsonString, Activity.class);

        System.out.println("淘宝活动优化处理流程1" + activity.getName() + " - ");
        processRecord.append("淘宝活动优化处理流程1" + activity.getName() + " - ");
//        System.out.println("淘宝活动优化处理流程1" + jsonString + " - ");
//        processRecord.append("淘宝活动优化处理流程1" + jsonString + " - ");
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
