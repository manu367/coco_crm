package org.coco.coco.service;

import org.coco.coco.shared.dto.request.RoleRequest;
import org.coco.coco.shared.dto.response.PermissionResponse;
import org.coco.coco.shared.dto.response.RoleResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.List;

public interface RoleService {

    RoleResponse createRole(RoleRequest request);

    RoleResponse updateRole(Long roleId, RoleRequest request);

    RoleResponse getRoleById(Long roleId);

    RoleResponse getRoleByName(String roleName);

    List<RoleResponse> getAllRoles();

    Page<RoleResponse> getAllRoles(Pageable pageable);

    List<RoleResponse> searchRoles(String keyword);

    void changeStatus(Long roleId, Long statusId);

    void deleteRole(Long roleId);

    boolean existsByRoleName(String roleName);

    void assignPermissions(Long roleId, List<Long> permissionIds);

    void removePermissions(Long roleId, List<Long> permissionIds);

    List<PermissionResponse> getRolePermissions(Long roleId);
}