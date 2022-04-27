package dts.com.digitizing.service.impl;

import dts.com.digitizing.entity.GeneralInformation;
import dts.com.digitizing.repository.GeneralInformationRespository;
import dts.com.digitizing.service.GeneralInformationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeneralInformationServiceImpl implements GeneralInformationService {
    private final GeneralInformationRespository generalInformationRespository;

    public GeneralInformationServiceImpl(
            GeneralInformationRespository generalInformationRespository) {this.generalInformationRespository = generalInformationRespository;}

    @Override
    public List<GeneralInformation> fillAllGe() {
        return generalInformationRespository.findAll();
    }

    @Override
    public GeneralInformation getOneGe(float orderNumber) {
        List<GeneralInformation> list = generalInformationRespository.findAll();
        GeneralInformation generalInformation = new GeneralInformation();
        for (GeneralInformation gen : list) {
            if (gen.getOrderNumber()==(orderNumber) ) {
                generalInformation = gen;
                break;
            }
        }
        return generalInformation;
    }


    @Override
    public void deleteAllGe() {
        generalInformationRespository.deleteAll();
    }

    @Override
    public void deleteOneGe(float orderNumber) {
        List<GeneralInformation> list = generalInformationRespository.findAll();
        for (GeneralInformation gen : list) {
            if (gen.getOrderNumber()== orderNumber ) {
                generalInformationRespository.delete(gen);
                break;
            }
        }
    }

    @Override
    public void createGe(GeneralInformation generalInformation) {
        generalInformationRespository.save(generalInformation);
    }

    @Override
    public void editGe(float orderNumber, GeneralInformation generalInformation) {
        List<GeneralInformation> list = generalInformationRespository.findAll();
        for (GeneralInformation gen : list) {
            if (gen.getOrderNumber()==(orderNumber) ) {
                generalInformationRespository.delete(gen);
                break;
            }
        }
    }
}
