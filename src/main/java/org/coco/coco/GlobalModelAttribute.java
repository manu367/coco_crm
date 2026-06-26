package org.coco.coco;

import org.coco.coco.model.MenuMaster;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.*;

@ControllerAdvice
public class GlobalModelAttribute {
    @ModelAttribute("menus")
    public List<MenuMaster> menus() {
        List<MenuMaster> list=new ArrayList();
        Set<MenuMaster.SubMenu> submenu=new HashSet<>();

        list.add(new MenuMaster(0L,"Home","",0,null));

        submenu.add(new MenuMaster.SubMenu(0L,"overview","","",true));
        submenu.add(new MenuMaster.SubMenu(0L,"Analytics","","",true));
        submenu.add(new MenuMaster.SubMenu(0L,"Activity Logs","","",true));
        submenu.add(new MenuMaster.SubMenu(0L,"KPI Reports","","",true));
        list.add(new MenuMaster(0L,"Dashboard","",0,submenu));
        submenu.clear();
        submenu.add(new MenuMaster.SubMenu(0L,"","","",true));
        list.add(new MenuMaster(0L,"Website Management","",0,submenu));
        list.add(new MenuMaster(0L,"Subscription","",0,null));
        list.add(new MenuMaster(0L,"Product","",0,null));
        list.add(new MenuMaster(0L,"Order Management","",0,null));
        list.add(new MenuMaster(0L,"Customer Management","",0,null));
        list.add(new MenuMaster(0L,"Sales & Payments","",0,null));
        list.add(new MenuMaster(0L,"Offers and Coupens","",0,null));
        list.add(new MenuMaster(0L,"Marketing","",0,null));
        list.add(new MenuMaster(0L,"CRM","",0,null));
        list.add(new MenuMaster(0L,"Support Center","",0,null));
        list.add(new MenuMaster(0L,"IVR & Communication","",0,null));
        list.add(new MenuMaster(0L,"Warehouse","",0,null));
        list.add(new MenuMaster(0L,"Inventory","",0,null));
        list.add(new MenuMaster(0L,"logistics","",0,null));
        list.add(new MenuMaster(0L,"Finance","",0,null));
        list.add(new MenuMaster(0L,"Delivery Management","",0,null));
        list.add(new MenuMaster(0L,"Report and Analysis","",0,null));
        list.add(new MenuMaster(0L,"Team Management","fa-user-tie",0,null));
        list.add(new MenuMaster(0L,"Security","fa-shield-halved",0,null));
        list.add(new MenuMaster(0L,"Notification Center","fa-shield-halved",0,null));
        list.add(new MenuMaster(0L,"System Settings","fa-gears",0,null));
        return list;
    }
}
