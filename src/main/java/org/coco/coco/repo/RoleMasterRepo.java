package org.coco.coco.repo;

import org.coco.coco.model.PinCodeMaster;
import org.coco.coco.model.RoleMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleMasterRepo extends JpaRepository<RoleMaster,Long> {
}
