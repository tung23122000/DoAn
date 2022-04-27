package dts.com.digitizing.service;

import dts.com.digitizing.entity.Department;
import dts.com.digitizing.entity.GeneralInformation;

import java.util.List;

public interface GeneralInformationService {
    List<GeneralInformation> fillAllGe();
    GeneralInformation getOneGe(float orderNumber);
    void deleteAllGe();
    void deleteOneGe(float orderNumber);
    void createGe(GeneralInformation generalInformation);
    void editGe(float orderNumber,GeneralInformation department);
}
