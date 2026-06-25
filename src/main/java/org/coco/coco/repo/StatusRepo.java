package org.coco.coco.repo;

import org.coco.coco.model.StateMaster;
import org.coco.coco.model.StatusMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StatusRepo extends JpaRepository<StatusMaster,Long> {
    public Optional<StatusMaster> findByName(String name);
}
