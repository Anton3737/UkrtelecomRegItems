package items.UkrtelecomRegItems.service;


import items.UkrtelecomRegItems.entity.ContractInfo;
import items.UkrtelecomRegItems.entity.CpeInfo;
import items.UkrtelecomRegItems.entity.OntInfo;
import items.UkrtelecomRegItems.repository.OntInfoRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Data
public class OntInfoDao {

    @Autowired
    private final OntInfoRepository ontInfoRepository;


    public List<OntInfo> getAllOntInfo() {
        try {
            return ontInfoRepository.findAll();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public OntInfo getOntById(UUID id) {
        return ontInfoRepository.getReferenceById(id);
    }


    public OntInfo createNewOnt(OntInfo newOnt) {
        return ontInfoRepository.save(newOnt);
    }


    public void deleteOntById(UUID id) {
        ontInfoRepository.deleteById(id);
    }


}
