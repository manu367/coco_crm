package org.coco.coco.service;

import org.coco.coco.shared.dto.request.SystemSettingRequest;
import org.coco.coco.shared.dto.response.SystemSettingResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Map;

public interface SystemService {

    // Create
    SystemSettingResponse createSetting(SystemSettingRequest request);

    // Update
    SystemSettingResponse updateSetting(Long settingId,
                                        SystemSettingRequest request);

    // Get By Id
    SystemSettingResponse getSettingById(Long settingId);

    // Get By Key
    SystemSettingResponse getSettingByKey(String settingKey);

    // Get Value Only
    String getValue(String settingKey);

    // Save/Update By Key
    void saveOrUpdate(String settingKey,
                      String settingValue);

    // Get All
    List<SystemSettingResponse> getAllSettings();

    // Pagination
    Page<SystemSettingResponse> getAllSettings(Pageable pageable);

    // Group Wise
    List<SystemSettingResponse> getSettingsByGroup(String settingGroup);

    // Get Group As Map
    Map<String, String> getGroupSettings(String settingGroup);

    // Search
    List<SystemSettingResponse> searchSettings(String keyword);

    // Delete
    void deleteSetting(Long settingId);

    // Validation
    boolean existsByKey(String settingKey);
}
