package org.coco.coco.model;

import lombok.*;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class MenuMaster {
    private Long id;
    private String name;
    private String icon;
    private int order;
    private Set<SubMenu> childmenu;
    public static class SubMenu{
        private Long id;
        private String name;
        private String icon;
        private String path;
        private boolean isAction;

        public SubMenu(Long id, String name, String icon, String path, boolean isAction) {
            this.id = id;
            this.name = name;
            this.icon = icon;
            this.path = path;
            this.isAction = isAction;
        }
    }
}



