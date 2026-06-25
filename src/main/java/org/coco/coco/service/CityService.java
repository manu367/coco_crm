package org.coco.coco.service;

import org.coco.coco.model.CityMaster;
import org.coco.coco.shared.dto.request.CityRequest;
import org.coco.coco.shared.dto.response.CityResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface CityService {
    CityResponse createCity(CityRequest request);
    CityResponse updateCity(Long cityId, CityRequest request);
    CityResponse getCityById(Long cityId);
    List<CityResponse> getAllCities();
    Page<CityResponse> getAllCities(Pageable pageable);
    List<CityResponse> getCitiesByState(Long stateId);
    List<CityResponse> searchCity(String keyword);
    void deleteCity(Long cityId);
    void changeStatus(Long cityId, Long statusId);
    boolean existsByCityName(String cityName);

}
