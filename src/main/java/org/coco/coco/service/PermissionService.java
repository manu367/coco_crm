package org.coco.coco.service;

import org.coco.coco.shared.dto.request.PermissionRequest;
import org.coco.coco.shared.dto.response.PermissionResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface PermissionService {

    PermissionResponse createPermission(PermissionRequest request);

    PermissionResponse updatePermission(Long permissionId, PermissionRequest request);

    PermissionResponse getPermissionById(Long permissionId);

    PermissionResponse getPermissionByCode(String permissionCode);

    List<PermissionResponse> getAllPermissions();

    Page<PermissionResponse> getAllPermissions(Pageable pageable);

    List<PermissionResponse> searchPermissions(String keyword);

    List<PermissionResponse> getPermissionsByModule(String moduleName);

    void changeStatus(Long permissionId, Long statusId);

    void deletePermission(Long permissionId);

    boolean existsByPermissionCode(String permissionCode);

    boolean existsByPermissionName(String permissionName);
}
