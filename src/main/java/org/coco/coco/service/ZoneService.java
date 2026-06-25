package org.coco.coco.service;

import org.coco.coco.shared.dto.request.ZoneRequest;
import org.coco.coco.shared.dto.response.ZoneResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ZoneService {
    // Create
    ZoneResponse createZone(ZoneRequest request);
    // Update
    ZoneResponse updateZone(Long zoneId, ZoneRequest request);
    // Get By Id
    ZoneResponse getZoneById(Long zoneId);
    // Get By Code
    ZoneResponse getZoneByCode(String zoneCode);
    // Get All
    List<ZoneResponse> getAllZones();
    // Pagination
    Page<ZoneResponse> getAllZones(Pageable pageable);
    // Search
    List<ZoneResponse> searchZones(String keyword);
    // Change Status
    void changeStatus(Long zoneId, Long statusId);
    // Delete
    void deleteZone(Long zoneId);
    // Validation
    boolean existsByCode(String zoneCode);
    boolean existsByName(String zoneName);
}
