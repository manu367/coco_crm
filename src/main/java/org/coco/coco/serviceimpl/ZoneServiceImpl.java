package org.coco.coco.serviceimpl;

import lombok.AllArgsConstructor;
import org.coco.coco.model.StatusMaster;
import org.coco.coco.model.ZoneMaster;
import org.coco.coco.repo.StatusRepo;
import org.coco.coco.repo.ZoneRepo;
import org.coco.coco.service.StatusService;
import org.coco.coco.service.ZoneService;
import org.coco.coco.shared.dto.request.ZoneRequest;
import org.coco.coco.shared.dto.response.StatusResponse;
import org.coco.coco.shared.dto.response.ZoneResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ZoneServiceImpl implements ZoneService {
    private ZoneRepo zoneRepo;
    private StatusRepo statusRepo;

    @Override
    public ZoneResponse createZone(ZoneRequest request) {
        ZoneMaster zoneMaster=new ZoneMaster();
        zoneMaster.setZoneName(request.getZoneName());
        zoneMaster.setZoneCode(request.getZoneCode());
        java.lang.Long id =request.getStatusId();
        zoneMaster.setStatus(statusRepo.findById(id).get());
        zoneMaster=zoneRepo.save(zoneMaster);
        return ZoneResponse.builder()
                .zoneName(zoneMaster.getZoneName())
                .zoneCode(zoneMaster.getZoneCode())
                .statusId(zoneMaster.getStatus())
                .build();
    }

    @Override
    public ZoneResponse updateZone(Long zoneId, ZoneRequest request) {
        return null;
    }

    @Override
    public ZoneResponse getZoneById(Long zoneId) {
        return null;
    }

    @Override
    public ZoneResponse getZoneByCode(String zoneCode) {
        return null;
    }

    @Override
    public List<ZoneResponse> getAllZones() {
        return List.of();
    }

    @Override
    public Page<ZoneResponse> getAllZones(Pageable pageable) {
        return null;
    }

    @Override
    public List<ZoneResponse> searchZones(String keyword) {
        return List.of();
    }

    @Override
    public void changeStatus(Long zoneId, Long statusId) {

    }

    @Override
    public void deleteZone(Long zoneId) {

    }

    @Override
    public boolean existsByCode(String zoneCode) {
        return false;
    }

    @Override
    public boolean existsByName(String zoneName) {
        return false;
    }
}
