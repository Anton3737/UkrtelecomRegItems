package items.UkrtelecomRegItems.repository;

import items.UkrtelecomRegItems.entity.CpeInfo;
import items.UkrtelecomRegItems.entity.OntInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface OntInfoRepository extends JpaRepository<OntInfo, UUID> {
}
