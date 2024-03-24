package edu.clothing.repository;

import edu.clothing.entity.AdminEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository  extends CrudRepository<AdminEntity,Long> {
}
