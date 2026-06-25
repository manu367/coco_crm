package org.coco.coco.repo;

import org.coco.coco.model.TabMaster;
import org.coco.coco.model.ZoneMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZoneRepo extends JpaRepository<ZoneMaster,Long> {
}
