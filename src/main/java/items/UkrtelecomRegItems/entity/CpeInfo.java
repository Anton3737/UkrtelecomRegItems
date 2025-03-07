package items.UkrtelecomRegItems.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "cpe_info")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CpeInfo extends DeviceInfo {

    private String CpeMacAddress;

    private String CpeSerialNumber;

    private String CpeManufacturer;

    private LocalDateTime CpeBindingDate;

    @OneToOne(mappedBy = "cpeInfo", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private EquipmentRegistry equipmentRegistry;


}
