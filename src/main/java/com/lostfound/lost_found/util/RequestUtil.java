package com.lostfound.lost_found.util;

import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

public class RequestUtil {

    public static void quicklySetFiled(HttpServletRequest request, Object obj) throws NoSuchFieldException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, ParseException {
        Set<String> strings = request.getParameterMap().keySet();
        Class clazz = obj.getClass();
        for (String fieldName : strings)
        {
            StringBuilder builder = new StringBuilder();
            builder.append("set");
            builder.append(StringUtil.firstLetterToUpperCase(fieldName));
            String methodName = builder.toString();
            Field field = clazz.getDeclaredField(fieldName);
            Class<?> type = field.getType();
            Method method = clazz.getMethod(methodName, new Class[]{type});
            Object value = request.getParameter(fieldName);
            if (type.equals(Integer.class))
            {
                value = Integer.valueOf((String) value);
            }
            else if (type.equals(Date.class))
            {
                value = new SimpleDateFormat("yyyy-MM-dd").parse((String) value);
            }
            method.invoke(obj,value);

        }
    }

    public static void quicklySetFiledForTest(Object obj,String parameter,Object value) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException, NoSuchFieldException {
        Class clazz = obj.getClass();
        String[] split = parameter.split("_");
        StringBuilder builder = new StringBuilder();
        builder.append("set");
        for (String str : split)
        {
            str = str.replaceFirst(String.valueOf(str.charAt(0)),String.valueOf(str.charAt(0)).toUpperCase());
            builder.append(str);
        }
        String methodName = builder.toString();
        String fieldName = methodName.substring(4);
        fieldName = String.valueOf(methodName.charAt(3)).toLowerCase() + fieldName;
        Field field = clazz.getDeclaredField(fieldName);
        Class<?> type = field.getType();
        Method method = clazz.getMethod(methodName, new Class[]{type});
        method.invoke(obj,value);
    }

}
