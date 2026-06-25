package org.coco.coco.shared.dto.request;

import lombok.Data;

@Data
public class CityRequest {
    private String cityName;
    private Long stateId;
    private Long statusId;
    private boolean district;
}
