package org.coco.coco.shared.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CityResponse {

    private Long id;
    private String cityName;
    private String stateName;
    private String statusName;
    private boolean district;
}
