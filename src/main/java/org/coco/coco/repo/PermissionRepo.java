package org.coco.coco.repo;

import org.coco.coco.model.CityMaster;
import org.coco.coco.model.PermissionMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PermissionRepo extends JpaRepository<PermissionMaster,Long> {
}
