package items.UkrtelecomRegItems.repository;

import items.UkrtelecomRegItems.entity.ContractInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ContactInfoRepository extends JpaRepository<ContractInfo, Long> {


    ContractInfo getReferenceById(UUID id);



}
