package dts.com.digitizing.repository;

import dts.com.digitizing.entity.Probationary;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProbationaryRespository extends MongoRepository<Probationary,String> {
}
