package org.coco.coco.shared.dto.response;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StatusResponse {
    private Long id;
    private String statusName;
    private boolean active;
}
