package org.coco.coco.shared.dto.request;

import lombok.Data;

@Data
public class PincodeRequest {

    private String pincode;

    private Long cityId;

    private Long statusId;
}
