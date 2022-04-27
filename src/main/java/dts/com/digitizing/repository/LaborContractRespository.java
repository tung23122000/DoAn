package dts.com.digitizing.repository;

import dts.com.digitizing.entity.LaborContract;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaborContractRespository extends MongoRepository<LaborContract,String> {
}
