package dts.com.digitizing.service;

import dts.com.digitizing.entity.Department;
import dts.com.digitizing.entity.LeaveInformation;

import java.util.List;

public interface LeaveInformationService {
    List<LeaveInformation> fillAllLe();
    LeaveInformation getOneLe(String code);
    void deleteAllLe();
    void deleteOneLe(String code);
    void createLe(LeaveInformation leaveInformation);
    void editLe(String code,LeaveInformation leaveInformation);
}
