package org.coco.coco.service;

import org.coco.coco.shared.dto.request.StatusRequest;
import org.coco.coco.shared.dto.response.StatusResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface StatusService {

    // Create
    StatusResponse createStatus(StatusRequest request);

    // Update
    StatusResponse updateStatus(Long statusId, StatusRequest request);

    // Get By Id
    StatusResponse getStatusById(Long statusId);

    // Get By Name
    StatusResponse getStatusByName(String statusName);

    // Get All
    List<StatusResponse> getAllStatuses();

    // Pagination
    Page<StatusResponse> getAllStatuses(Pageable pageable);

    // Search
    List<StatusResponse> searchStatus(String keyword);

    // Activate / Deactivate
    void changeActiveStatus(Long statusId, boolean active);

    // Delete
    void deleteStatus(Long statusId);

    // Validation
    boolean existsByStatusName(String statusName);

    // Active Status List
    List<StatusResponse> getActiveStatuses();
}
