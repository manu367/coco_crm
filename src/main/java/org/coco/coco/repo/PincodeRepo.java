package org.coco.coco.repo;

import org.coco.coco.model.PermissionMaster;
import org.coco.coco.model.PinCodeMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PincodeRepo extends JpaRepository<PinCodeMaster,Long> {
}
