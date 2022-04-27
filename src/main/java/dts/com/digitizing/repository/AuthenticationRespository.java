package dts.com.digitizing.repository;

import dts.com.digitizing.entity.Authentication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthenticationRespository extends MongoRepository<Authentication,String> {

}
