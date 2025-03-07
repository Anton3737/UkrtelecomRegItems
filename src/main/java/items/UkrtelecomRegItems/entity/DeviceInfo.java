package items.UkrtelecomRegItems.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "device_info")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeviceInfo {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(updatable = false, nullable = false, unique = true)
    private UUID deviceId;

    @Column(unique = true, nullable = false)
    private String macAddress;

    @Column(unique = true, nullable = false)
    private String serialNumber;

    @Column(nullable = false)
    private String manufacturer;

    @Column(nullable = false)
    private LocalDateTime bindingDate;

    private String desiredTariffPlan;
    private String workOrderNumber;
    private String serviceType;


}
