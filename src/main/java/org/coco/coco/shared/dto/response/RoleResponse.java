package org.coco.coco.shared.dto.response;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RoleResponse {

    private Long id;

    private String roleName;

    private Integer displayOrder;

    private String statusName;
}
