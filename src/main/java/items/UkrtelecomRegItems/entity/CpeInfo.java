package items.UkrtelecomRegItems.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;
import java.util.UUID;

@MappedSuperclass
@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "cpe_info")
public class CpeInfo extends DeviceInfo {

    private String CpeMacAddress;

    private String CpeSerialNumber;

    private String CpeManufacturer;

    private LocalDateTime CpeBindingDate;

    @OneToOne(mappedBy = "cpeInfo", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private EquipmentRegistry equipmentRegistry;

    public CpeInfo() {

    }

    public CpeInfo(UUID deviceId, String macAddress, String serialNumber, String manufacturer, LocalDateTime bindingDate, String desiredTariffPlan, String workOrderNumber, String serviceType, String cpeMacAddress, String cpeSerialNumber, String cpeManufacturer, LocalDateTime cpeBindingDate, EquipmentRegistry equipmentRegistry) {
        super(deviceId, macAddress, serialNumber, manufacturer, bindingDate, desiredTariffPlan, workOrderNumber, serviceType);
        CpeMacAddress = cpeMacAddress;
        CpeSerialNumber = cpeSerialNumber;
        CpeManufacturer = cpeManufacturer;
        CpeBindingDate = cpeBindingDate;
        this.equipmentRegistry = equipmentRegistry;
    }

    public String getCpeMacAddress() {
        return CpeMacAddress;
    }

    public void setCpeMacAddress(String cpeMacAddress) {
        CpeMacAddress = cpeMacAddress;
    }

    public String getCpeSerialNumber() {
        return CpeSerialNumber;
    }

    public void setCpeSerialNumber(String cpeSerialNumber) {
        CpeSerialNumber = cpeSerialNumber;
    }

    public String getCpeManufacturer() {
        return CpeManufacturer;
    }

    public void setCpeManufacturer(String cpeManufacturer) {
        CpeManufacturer = cpeManufacturer;
    }

    public LocalDateTime getCpeBindingDate() {
        return CpeBindingDate;
    }

    public void setCpeBindingDate(LocalDateTime cpeBindingDate) {
        CpeBindingDate = cpeBindingDate;
    }

    public EquipmentRegistry getEquipmentRegistry() {
        return equipmentRegistry;
    }

    public void setEquipmentRegistry(EquipmentRegistry equipmentRegistry) {
        this.equipmentRegistry = equipmentRegistry;
    }
}
