package items.UkrtelecomRegItems.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@MappedSuperclass

public class DeviceInfo {

    @Id
    @GeneratedValue(generator = "UUID")
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

    public DeviceInfo() {
    }


    public DeviceInfo(UUID deviceId, String macAddress, String serialNumber, String manufacturer, LocalDateTime bindingDate, String desiredTariffPlan, String workOrderNumber, String serviceType) {
        this.deviceId = deviceId;
        this.macAddress = macAddress;
        this.serialNumber = serialNumber;
        this.manufacturer = manufacturer;
        this.bindingDate = bindingDate;
        this.desiredTariffPlan = desiredTariffPlan;
        this.workOrderNumber = workOrderNumber;
        this.serviceType = serviceType;
    }

    public UUID getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(UUID deviceId) {
        this.deviceId = deviceId;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public LocalDateTime getBindingDate() {
        return bindingDate;
    }

    public void setBindingDate(LocalDateTime bindingDate) {
        this.bindingDate = bindingDate;
    }

    public String getDesiredTariffPlan() {
        return desiredTariffPlan;
    }

    public void setDesiredTariffPlan(String desiredTariffPlan) {
        this.desiredTariffPlan = desiredTariffPlan;
    }

    public String getWorkOrderNumber() {
        return workOrderNumber;
    }

    public void setWorkOrderNumber(String workOrderNumber) {
        this.workOrderNumber = workOrderNumber;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }
}
