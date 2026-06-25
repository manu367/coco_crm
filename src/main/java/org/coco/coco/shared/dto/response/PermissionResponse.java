package org.coco.coco.shared.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PermissionResponse {

    private Long id;

    private String moduleName;

    private String permissionName;

    private String permissionCode;

    private String statusName;
}
