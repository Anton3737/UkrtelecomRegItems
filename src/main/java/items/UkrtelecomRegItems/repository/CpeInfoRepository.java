package items.UkrtelecomRegItems.repository;

import items.UkrtelecomRegItems.entity.ContractInfo;
import items.UkrtelecomRegItems.entity.CpeInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CpeInfoRepository extends JpaRepository<CpeInfo, UUID>  {
}
