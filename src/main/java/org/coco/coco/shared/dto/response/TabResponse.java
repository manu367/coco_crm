package org.coco.coco.shared.dto.response;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TabResponse {

    private Long id;

    private String name;

    private String icon;

    private String route;

    private Long parentId;

    private String parentName;

    private Integer displayOrder;

    private String moduleCode;

    private String permissionCode;

    private String statusName;
}
