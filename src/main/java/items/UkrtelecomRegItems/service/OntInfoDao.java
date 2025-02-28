package items.UkrtelecomRegItems.service;


import items.UkrtelecomRegItems.entity.ContractInfo;
import items.UkrtelecomRegItems.repository.OntInfoRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
public class OntInfoDao {

    @Autowired
    private final OntInfoRepository ontInfoRepository;








}
