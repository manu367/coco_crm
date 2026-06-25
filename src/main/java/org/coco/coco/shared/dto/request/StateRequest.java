package org.coco.coco.shared.dto.request;

import lombok.Data;

@Data
public class StateRequest {

    private String stateName;

    private String stateCode;

    private Long zoneId;

    private Long statusId;
}
