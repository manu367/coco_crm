package org.coco.coco.shared.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SystemSettingResponse {

    private Long id;

    private String settingKey;

    private String settingValue;

    private String settingGroup;

    private String description;

    private String statusName;
}
