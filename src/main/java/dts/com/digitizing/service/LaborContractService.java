package dts.com.digitizing.service;

import dts.com.digitizing.entity.Department;
import dts.com.digitizing.entity.LaborContract;

import java.util.List;

public interface LaborContractService {
    List<LaborContract> fillAllLa();
    LaborContract getOneLa(String id);
    void deleteAllLa();
    void deleteOneLa(String id);
    void createLa(LaborContract laborContract);
    void editLa(String id,LaborContract laborContract);
}
