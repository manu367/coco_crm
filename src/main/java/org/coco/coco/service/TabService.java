package org.coco.coco.service;

import org.coco.coco.shared.dto.request.TabRequest;
import org.coco.coco.shared.dto.response.TabResponse;
import org.coco.coco.shared.dto.response.TabTreeResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface TabService {

    // Create
    TabResponse createTab(TabRequest request);

    // Update
    TabResponse updateTab(Long tabId, TabRequest request);

    // Get By Id
    TabResponse getTabById(Long tabId);

    // Get By Module Code
    TabResponse getTabByModuleCode(String moduleCode);

    // Get All
    List<TabResponse> getAllTabs();

    // Pagination
    Page<TabResponse> getAllTabs(Pageable pageable);

    // Parent Menus
    List<TabResponse> getParentTabs();

    // Child Menus
    List<TabResponse> getChildTabs(Long parentId);

    // Menu Tree
    List<TabTreeResponse> getMenuTree();

    // Role Wise Menu
    List<TabTreeResponse> getMenusByRole(Long roleId);

    // Search
    List<TabResponse> searchTabs(String keyword);

    // Change Status
    void changeStatus(Long tabId, Long statusId);

    // Update Display Order
    void updateDisplayOrder(Long tabId, Integer displayOrder);

    // Delete
    void deleteTab(Long tabId);

    // Validation
    boolean existsByModuleCode(String moduleCode);

    boolean existsByName(String name);
}
