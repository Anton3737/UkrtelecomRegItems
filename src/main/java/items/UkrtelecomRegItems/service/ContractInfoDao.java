package items.UkrtelecomRegItems.service;

import items.UkrtelecomRegItems.entity.ContractInfo;
import items.UkrtelecomRegItems.repository.ContractInfoRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Data
public class ContractInfoDao {


    @Autowired
    private final ContractInfoRepository contractInfoRepository;


    public List<ContractInfo> getAllContractInfo() {
        try {
            return contractInfoRepository.findAll();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public ContractInfo getContract(UUID id) {
        return contractInfoRepository.getReferenceById(id);
    }


    public ContractInfo createNewContract(ContractInfo newContract) {
        return contractInfoRepository.save(newContract);
    }


    public void deleteContractById(UUID id) {
        contractInfoRepository.deleteById(id);
    }


}
