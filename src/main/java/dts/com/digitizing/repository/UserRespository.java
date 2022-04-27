package dts.com.digitizing.repository;

import dts.com.digitizing.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRespository extends MongoRepository<User, String> {
}
