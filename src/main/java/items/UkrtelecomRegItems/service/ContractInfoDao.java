package items.UkrtelecomRegItems.service;

import items.UkrtelecomRegItems.entity.ContractInfo;
import items.UkrtelecomRegItems.repository.ContactInfoRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Data
public class ContractInfoDao {


    @Autowired
    private final ContactInfoRepository contactInfoRepository;


    public List<ContractInfo> getAllContractInfo() {
        try {
            return contactInfoRepository.findAll();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }


    public ContractInfo getContract(UUID id){
        return contactInfoRepository.getReferenceById(id);
    }



    public ContractInfo createNewContract(ContractInfo newContract) {
        return contactInfoRepository.save(newContract);
    }


    public void deleteContractById(UUID id){
        contactInfoRepository.deleteById(id);
    }






}
