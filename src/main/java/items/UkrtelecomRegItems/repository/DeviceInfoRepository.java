package items.UkrtelecomRegItems.repository;

import items.UkrtelecomRegItems.entity.CpeInfo;
import items.UkrtelecomRegItems.entity.DeviceInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface DeviceInfoRepository extends JpaRepository<DeviceInfo, UUID> {
}
