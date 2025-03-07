package items.UkrtelecomRegItems.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "ont_info")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OntInfo extends DeviceInfo {

    private String OntMacAddress;
    private String OntSerialNumber;
    private String OntManufacturer;
    private LocalDateTime OntBindingDate;

    @OneToOne(mappedBy = "ontInfo", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private EquipmentRegistry equipmentRegistry;

}
