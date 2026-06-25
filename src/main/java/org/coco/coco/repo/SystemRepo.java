package org.coco.coco.repo;

import org.coco.coco.model.StatusMaster;
import org.coco.coco.model.SystemSettings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SystemRepo extends JpaRepository<SystemSettings, Long> {

    Optional<SystemSettings>
    findBySettingKey(String settingKey);

    boolean existsBySettingKey(String settingKey);

    List<SystemSettings>
    findBySettingGroup(String settingGroup);

    List<SystemSettings>
    findBySettingKeyContainingIgnoreCase(String keyword);
}
