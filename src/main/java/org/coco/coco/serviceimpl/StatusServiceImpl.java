package org.coco.coco.serviceimpl;

import lombok.AllArgsConstructor;
import org.coco.coco.model.StatusMaster;
import org.coco.coco.repo.StatusRepo;
import org.coco.coco.service.StatusService;
import org.coco.coco.shared.dto.request.StatusRequest;
import org.coco.coco.shared.dto.response.StatusResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
public class StatusServiceImpl implements StatusService {
     StatusRepo statusRepo;
    @Override
    public StatusResponse createStatus(StatusRequest request) {
//        StatusMaster statusMaster=new StatusMaster();
//        statusMaster.setStatusName(request.getStatusName().toUpperCase());
//        statusMaster.setActive(request.isActive());
//        statusMaster=statusRepo.save(statusMaster);
        return StatusResponse.builder()
//                .statusName(statusMaster.getStatusName())
//                .active(statusMaster.isActive())
                .build();
    }

    @Override
    public StatusResponse updateStatus(Long statusId, StatusRequest request) {
        return null;
    }

    @Override
    public StatusResponse getStatusById(Long statusId) {
        StatusMaster statusMaster =statusRepo.findById(statusId).orElseThrow(()->new RuntimeException("In status master have not value"));
        return StatusResponse.builder()
                .id(statusMaster.getId())
                .statusName(statusMaster.getStatusName())
                .active(statusMaster.isActive())
                .build();
    }

    @Override
    public StatusResponse getStatusByName(String statusName) {
        org.coco.coco.model.StatusMaster statusMaster =statusRepo.findByName(statusName).orElseThrow(()->new RuntimeException("Not found"));
        return StatusResponse.builder()
                .id(statusMaster.getId())
                .statusName(statusMaster.getStatusName())
                .active(statusMaster.isActive())
                .build();
    }

    @Override
    public List<StatusResponse> getAllStatuses() {
        List<StatusMaster> all = statusRepo.findAll();
        return all.stream()
                .map(status -> StatusResponse.builder()
                        .id(status.getId())
                        .statusName(status.getStatusName())
                        .active(status.isActive())
                        .build())
                .toList();
    }

    @Override
    public Page<StatusResponse> getAllStatuses(Pageable pageable) {
        return null;
    }

    @Override
    public List<StatusResponse> searchStatus(String keyword) {
        return List.of();
    }

    @Override
    public void changeActiveStatus(Long statusId, boolean active) {

    }

    @Override
    public void deleteStatus(Long statusId) {

    }

    @Override
    public boolean existsByStatusName(String statusName) {
        return false;
    }

    @Override
    public List<StatusResponse> getActiveStatuses() {
        return List.of();
    }
}
