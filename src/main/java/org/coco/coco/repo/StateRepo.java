package org.coco.coco.repo;

import org.coco.coco.model.RoleMaster;
import org.coco.coco.model.StateMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateRepo extends JpaRepository<StateMaster,Long> {
}
