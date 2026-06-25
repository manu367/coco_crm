package org.coco.coco.shared.dto.request;

import lombok.Data;

@Data
public class PermissionRequest {

    private String moduleName;

    private String permissionName;

    private String permissionCode;

    private Long statusId;
}
