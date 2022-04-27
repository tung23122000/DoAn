package dts.com.digitizing.repository;

import dts.com.digitizing.entity.GeneralInformation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneralInformationRespository extends MongoRepository<GeneralInformation, Float> {
}
