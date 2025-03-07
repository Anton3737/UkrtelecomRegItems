package items.UkrtelecomRegItems.service;

import items.UkrtelecomRegItems.entity.DeviceInfo;
import items.UkrtelecomRegItems.entity.OntInfo;
import items.UkrtelecomRegItems.repository.DeviceInfoRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Data
public class DeviceInfoDao {

    @Autowired
    private final DeviceInfoRepository deviceInfoRepository;


    public List<DeviceInfo> getAllDeviceInfo() {
        try {
            return deviceInfoRepository.findAll();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public DeviceInfo getDeviceById(UUID id) {
        return deviceInfoRepository.getReferenceById(id);
    }


    public DeviceInfo createNewDevice(DeviceInfo newDeviceInfo) {
        return deviceInfoRepository.save(newDeviceInfo);
    }


    public void deleteDeviceById(UUID id) {
        deviceInfoRepository.deleteById(id);
    }


}
