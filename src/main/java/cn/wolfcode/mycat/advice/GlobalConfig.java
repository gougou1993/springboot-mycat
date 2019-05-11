package cn.wolfcode.mycat.advice;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;

/**
 * GlobalConfig
 */
@ControllerAdvice
public class GlobalConfig {

    @ModelAttribute(value = "info")
    public Map<String, String> userInfo() {
        Map<String, String> map = new HashMap<>();
        map.put("username", "zhong");
        map.put("gender", "男");
        return map;
    }

    @InitBinder("b")
    public void init(WebDataBinder binder) {
        binder.setFieldDefaultPrefix("b.");
    }

    @InitBinder("a")
    public void init2(WebDataBinder binder) {
        binder.setFieldDefaultPrefix("a.");
    }
}