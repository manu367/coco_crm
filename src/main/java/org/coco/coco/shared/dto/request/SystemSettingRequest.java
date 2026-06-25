package org.coco.coco.shared.dto.request;

import lombok.Data;

@Data
public class SystemSettingRequest {

    private String settingKey;

    private String settingValue;

    private String settingGroup;

    private String description;

    private Long statusId;
}
