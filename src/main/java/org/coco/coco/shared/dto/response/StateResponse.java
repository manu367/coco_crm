package org.coco.coco.shared.dto.response;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StateResponse {

    private Long stateId;
    private String stateName;
    private String stateCode;
    private Long zoneId;
    private String zoneName;
    private String statusName;
}