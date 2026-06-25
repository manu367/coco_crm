package org.coco.coco.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/website-management")
public class WebSiteManagementController {
    @GetMapping
    public String home(){
        return "admin/website/websitemanager";
    }

    @GetMapping("/page-management")
    public String pageManagement(){return "";}

    @GetMapping("/blog-management")
    public String blogManagement(){
        return "";
    }

    @GetMapping("/media-libery")
    public String mediaLibery(){
        return "";
    }

    @GetMapping("/theme-setting")
    public String themeSettings(){
        return "";
    }

    @GetMapping("/ui-management")
    public String uiManagement(){
        return "";
    }
    @GetMapping("/social-media-setting")
    public String socialMediaSetting(){
        return "";
    }

    @GetMapping("/api-setting")
    public String apiSetting(){
        return "";
    }

    @GetMapping("/seo-management")
    public String seoManagement(){
        return "";
    }

    @GetMapping("/user-management")
    public String userManagement(){
        return "";
    }

    @GetMapping("/web-payments")
    public String webPayments(){
        // Payment Management ( Payment History , Payment Gatways , Invoices , Refund Management , )
        return "";
    }

    @GetMapping("/live-product")
    public String liveProduct(){
        // Live Product ( Create , Share , Buy )
        return "";
    }

}
