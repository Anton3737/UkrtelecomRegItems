package items.UkrtelecomRegItems.service;

import items.UkrtelecomRegItems.entity.ContractInfo;
import items.UkrtelecomRegItems.entity.CpeInfo;
import items.UkrtelecomRegItems.repository.CpeInfoRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Data
public class CpeInfoDao {

    @Autowired
    private final CpeInfoRepository cpeInfoRepository;


    public List<CpeInfo> getAllCpeInfo() {
        try {
            return cpeInfoRepository.findAll();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public CpeInfo getCpeById(UUID id) {
        return cpeInfoRepository.getReferenceById(id);
    }


    public CpeInfo createNewCpe(CpeInfo newCpe) {
        return cpeInfoRepository.save(newCpe);
    }


    public void deleteCpeById(UUID id) {
        cpeInfoRepository.deleteById(id);
    }


}
