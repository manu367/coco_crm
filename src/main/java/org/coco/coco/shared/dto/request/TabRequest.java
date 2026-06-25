package org.coco.coco.shared.dto.request;

import lombok.Data;

@Data
public class TabRequest {

    private String name;

    private String icon;

    private String route;

    private Long parentId;

    private Integer displayOrder;

    private String moduleCode;

    private String permissionCode;

    private Long statusId;
}
