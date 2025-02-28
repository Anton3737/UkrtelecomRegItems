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
@Table(name = "ont_info")
public class OntInfo extends DeviceInfo {

    private String OntMacAddress;
    private String OntSerialNumber;
    private String OntManufacturer;
    private LocalDateTime OntBindingDate;

    @OneToOne(mappedBy = "ontInfo", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private EquipmentRegistry equipmentRegistry;

    public OntInfo() {

    }

    public OntInfo(UUID deviceId, String macAddress, String serialNumber, String manufacturer, LocalDateTime bindingDate, String desiredTariffPlan, String workOrderNumber, String serviceType, String ontMacAddress, String ontSerialNumber, String ontManufacturer, LocalDateTime ontBindingDate, EquipmentRegistry equipmentRegistry) {
        super(deviceId, macAddress, serialNumber, manufacturer, bindingDate, desiredTariffPlan, workOrderNumber, serviceType);
        OntMacAddress = ontMacAddress;
        OntSerialNumber = ontSerialNumber;
        OntManufacturer = ontManufacturer;
        OntBindingDate = ontBindingDate;
        this.equipmentRegistry = equipmentRegistry;
    }

    public String getOntMacAddress() {
        return OntMacAddress;
    }

    public void setOntMacAddress(String ontMacAddress) {
        OntMacAddress = ontMacAddress;
    }

    public String getOntSerialNumber() {
        return OntSerialNumber;
    }

    public void setOntSerialNumber(String ontSerialNumber) {
        OntSerialNumber = ontSerialNumber;
    }

    public String getOntManufacturer() {
        return OntManufacturer;
    }

    public void setOntManufacturer(String ontManufacturer) {
        OntManufacturer = ontManufacturer;
    }

    public LocalDateTime getOntBindingDate() {
        return OntBindingDate;
    }

    public void setOntBindingDate(LocalDateTime ontBindingDate) {
        OntBindingDate = ontBindingDate;
    }

    public EquipmentRegistry getEquipmentRegistry() {
        return equipmentRegistry;
    }

    public void setEquipmentRegistry(EquipmentRegistry equipmentRegistry) {
        this.equipmentRegistry = equipmentRegistry;
    }
}
