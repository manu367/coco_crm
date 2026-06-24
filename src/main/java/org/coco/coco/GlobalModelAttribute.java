package org.coco.coco;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalModelAttribute {
    @ModelAttribute("menus")
    public Map<String,String> menus() {
        Map<String,String> map = new LinkedHashMap<>();
        map.put("Dashboard","/home");
        map.put("Reports","/reports");
        map.put("Settings","/settings");

        return map;
    }
}
