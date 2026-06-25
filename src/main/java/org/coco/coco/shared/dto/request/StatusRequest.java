package org.coco.coco.shared.dto.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StatusRequest {

    private String statusName;

    private boolean active;
}
