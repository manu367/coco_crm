package org.coco.coco.shared.dto;

import lombok.*;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MenuDTO {
    private Long id;
    private String name;
    private String icon;
    private String route;
    private String moduleCode;
    private Integer displayOrder;
    private List<MenuDTO> children;
}
