package org.coco.coco.shared.dto.request;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ZoneRequest {
    private String zoneName;
//    @NotBlank(message = "Zone code is required")
//    @Size(max = 50, message = "Zone code must not exceed 50 characters")
    private String zoneCode;
//    @NotNull(message = "Status is required")
    private Long statusId;
}
