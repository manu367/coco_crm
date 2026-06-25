package org.coco.coco.shared.dto.request;

import lombok.Data;

@Data
public class RoleRequest {

    private String roleName;

    private Integer displayOrder;

    private Long statusId;
}
