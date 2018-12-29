package com.student.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JsonUtil {
    public static Map<String, Object> getSuccessMessage(String message, Object other) {
        Map<String, Object> result = new HashMap<>();
        result.put("status", true);
        result.put("message", message);
        result.put("other", other);
        return result;
    }

    public static Map<String, Object> getErrorMessage(String message, Object other) {
        Map<String, Object> result = new HashMap<>();
        result.put("status", false);
        result.put("message", message);
        result.put("other", other);
        return result;
    }

    public static Map<String, Object> getDatagridPagerResult(long total, List list) {
        Map<String, Object> result = new HashMap<>();
        result.put("total", total);//总条数
        result.put("rows", list);//返回的list数据
        return result;
    }
}
