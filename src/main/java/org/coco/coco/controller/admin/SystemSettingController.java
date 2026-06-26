package org.coco.coco.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/settings")
public class SystemSettingController {
    @GetMapping
    public String generalSetting(){
        return  "admin/setting/generalsetting";
    }
    @GetMapping("/profile")
    public String companyProfile(){
        return  "admin/setting/companyprofile";
    }
    @GetMapping("/edit-config")
    public String editConfigiguration(){
        return  "admin/setting/editconfiguration";
    }
    @GetMapping("/email-config")
    public String emailConfigiguration(){
        return  "admin/setting/emailconfig";
    }
    @GetMapping("/sms-config")
    public String smsConfigiguration(){
        return  "admin/setting/smsconfig";
    }
    @GetMapping("/payment-config")
    public String paymentConfigiguration(){
        return  "admin/setting/paymentconfig";
    }
    @GetMapping("/intregations")
    public String intregations(){
        return  "admin/setting/intregations";
    }
    @GetMapping("/backup-and-restore")
    public String backupAndRestore(){
        return  "admin/setting/backupRestore";
    }
}
