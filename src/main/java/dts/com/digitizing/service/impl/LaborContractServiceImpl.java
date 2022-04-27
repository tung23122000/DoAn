package dts.com.digitizing.service.impl;

import dts.com.digitizing.entity.GeneralInformation;
import dts.com.digitizing.entity.LaborContract;
import dts.com.digitizing.repository.LaborContractRespository;
import dts.com.digitizing.service.LaborContractService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaborContractServiceImpl implements LaborContractService {

    private final LaborContractRespository laborContractRespository;

    public LaborContractServiceImpl(
            LaborContractRespository laborContractRespository) {this.laborContractRespository = laborContractRespository;}


    @Override
    public List<LaborContract> fillAllLa() {
        return laborContractRespository.findAll();
    }

    @Override
    public LaborContract getOneLa(String id) {
        List<LaborContract> list = laborContractRespository.findAll();
        LaborContract laborContract = new LaborContract();
        for (LaborContract lab : list) {
            if (lab.get_id().equals(id)  ) {
                laborContract = lab;
                break;
            }
        }
        return laborContract;
    }

    @Override
    public void deleteAllLa() {
        laborContractRespository.deleteAll();
    }

    @Override
    public void deleteOneLa(String id) {
        List<LaborContract> list = laborContractRespository.findAll();
        for (LaborContract lab : list) {
            if (lab.get_id().equals(id)  ) {
                laborContractRespository.delete(lab);
                break;
            }
        }

    }

    @Override
    public void createLa(LaborContract laborContract) {
        laborContractRespository.save(laborContract);
    }

    @Override
    public void editLa(String id, LaborContract laborContract) {
        List<LaborContract> list = laborContractRespository.findAll();
        for (LaborContract lab : list) {
            if (lab.get_id().equals(id)  ) {
                laborContractRespository.delete(lab);
                laborContractRespository.save(laborContract);
                break;
            }
        }
    }
}
