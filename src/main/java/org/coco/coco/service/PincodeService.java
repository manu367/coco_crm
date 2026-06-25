package org.coco.coco.service;

import org.coco.coco.shared.dto.request.PincodeRequest;
import org.coco.coco.shared.dto.response.PincodeResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface PincodeService {

    // Create
    PincodeResponse createPincode(PincodeRequest request);

    // Update
    PincodeResponse updatePincode(Long pincodeId,
                                  PincodeRequest request);

    // Get By Id
    PincodeResponse getPincodeById(Long pincodeId);

    // Get By Pincode
    PincodeResponse getByPincode(String pincode);

    // Get All
    List<PincodeResponse> getAllPincodes();

    // Pagination
    Page<PincodeResponse> getAllPincodes(Pageable pageable);

    // Search
    List<PincodeResponse> searchPincode(String keyword);

    // City Wise
    List<PincodeResponse> getPincodesByCity(Long cityId);

    // Status Change
    void changeStatus(Long pincodeId, Long statusId);

    // Delete
    void deletePincode(Long pincodeId);

    // Validation
    boolean existsByPincode(String pincode);
}
