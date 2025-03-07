package items.UkrtelecomRegItems.DTO;

import lombok.Data;

import java.time.OffsetDateTime;
import java.util.UUID;

@Data
public class EquipmentDTO {
    // Contract info
    private UUID contactInfoId;
    private String contractId;
    private String departmentCode;
    private String accountNumber;
    private String contractNumber;
    private String login;
    private OffsetDateTime createdData;

    // device_info
    private UUID deviceId;
    private String macAddress;
    private String serialNumber;
    private String manufacturer;
    private OffsetDateTime bindingDate;
    private String desiredTariffPlan;
    private String workOrderNumber;
    private String serviceType;

    // cpe_info
    private String cpeMacAddress;
    private String cpeSerialNumber;
    private String cpeManufacturer;
    private OffsetDateTime cpeBindingDate;

    // ont_info
    private String ontMacAddress;
    private String ontSerialNumber;
    private String ontManufacturer;
    private OffsetDateTime ontBindingDate;
}
