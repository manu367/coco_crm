package org.coco.coco.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/security")
public class SecurityController {
    @GetMapping
    public String security(){
        return "admin/security/overview";
    }
    @GetMapping("/login-history")
    public String loginHistory(){
        return "admin/security/overview";
    }

    @GetMapping("/audit-logs")
    public String auditLogs(){
        return "admin/security/overview";
    }

    @GetMapping("/api-keys")
    public String apiKeys(){
        return "admin/security/overview";
    }

    @GetMapping("/sessions")
    public String appSessiosn(){
        return "admin/security/overview";
    }

    @GetMapping("/device-management")
    public String deviceManagement(){
        return "admin/security/overview";
    }
}
