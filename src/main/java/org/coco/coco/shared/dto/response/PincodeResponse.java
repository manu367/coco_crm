package org.coco.coco.shared.dto.response;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PincodeResponse {

    private Long id;

    private String pincode;

    private Long cityId;

    private String cityName;

    private String stateName;

    private String statusName;
}
