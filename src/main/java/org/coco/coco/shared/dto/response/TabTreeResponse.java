package org.coco.coco.shared.dto.response;

import lombok.*;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TabTreeResponse {
    private Long id;
    private String name;
    private String icon;
    private String route;
    private Integer displayOrder;
    private List<TabTreeResponse> children;
}
