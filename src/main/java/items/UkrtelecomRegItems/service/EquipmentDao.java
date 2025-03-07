package items.UkrtelecomRegItems.service;

import items.UkrtelecomRegItems.entity.EquipmentRegistry;
import items.UkrtelecomRegItems.repository.EquipmentRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Data
@RequiredArgsConstructor
public class EquipmentDao {


    @Autowired
    private final EquipmentRepository equipmentRepository;


    public List<EquipmentRegistry> getAllEquipmentInfo() {
        try {
            return equipmentRepository.findAll();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public EquipmentRegistry getEquipmentById(UUID id) {
        return equipmentRepository.getReferenceById(id);
    }




    public void deleteEquipmentById(UUID id) {
        equipmentRepository.deleteById(id);
    }

}
