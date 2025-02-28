package items.UkrtelecomRegItems.service;

import items.UkrtelecomRegItems.repository.DeviceInfoRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Data
public class DeviceInfoDao {

    @Autowired
    private final DeviceInfoRepository deviceInfoRepository;

}
