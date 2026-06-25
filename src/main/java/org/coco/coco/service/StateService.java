package org.coco.coco.service;

import org.coco.coco.shared.dto.request.StateRequest;
import org.coco.coco.shared.dto.response.StateResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface StateService {

    // Create
    StateResponse createState(StateRequest request);

    // Update
    StateResponse updateState(Long stateId, StateRequest request);

    // Get By Id
    StateResponse getStateById(Long stateId);

    // Get By Code
    StateResponse getStateByCode(String stateCode);

    // Get All
    List<StateResponse> getAllStates();

    // Pagination
    Page<StateResponse> getAllStates(Pageable pageable);

    // Search
    List<StateResponse> searchStates(String keyword);

    // Zone Wise States
    List<StateResponse> getStatesByZone(Long zoneId);

    // Status Change
    void changeStatus(Long stateId, Long statusId);

    // Delete
    void deleteState(Long stateId);

    // Validation
    boolean existsByStateName(String stateName);

    boolean existsByStateCode(String stateCode);
}
