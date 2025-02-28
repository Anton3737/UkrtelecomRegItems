package items.UkrtelecomRegItems.service;

import items.UkrtelecomRegItems.repository.CpeInfoRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Data
public class CpeInfoDao{

    @Autowired
    private final CpeInfoRepository cpeInfoRepository;


}
