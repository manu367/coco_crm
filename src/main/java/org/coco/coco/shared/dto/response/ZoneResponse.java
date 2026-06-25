package org.coco.coco.shared.dto.response;

import lombok.*;
import org.coco.coco.model.StatusMaster;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ZoneResponse {
    private Long zoneId;
    private String zoneName;
    private String zoneCode;
    private StatusMaster statusId;
}
