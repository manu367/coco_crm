package org.coco.coco.repo;

import org.coco.coco.model.SystemSettings;
import org.coco.coco.model.TabMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface TabRepo extends JpaRepository<TabMaster,Long> {
    Optional<TabMaster> findByModuleCode(String moduleCode);
    boolean existsByModuleCode(String moduleCode);

    boolean existsByNameIgnoreCase(String name);

    List<TabMaster> findByParentIsNullOrderByDisplayOrder();

    List<TabMaster> findByParentIdOrderByDisplayOrder(Long parentId);

    List<TabMaster> findByNameContainingIgnoreCase(String keyword);
}
