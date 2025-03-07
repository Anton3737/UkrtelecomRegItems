package items.UkrtelecomRegItems.repository;

import items.UkrtelecomRegItems.entity.EquipmentRegistry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface EquipmentRepository extends JpaRepository<EquipmentRegistry, UUID> {
}
