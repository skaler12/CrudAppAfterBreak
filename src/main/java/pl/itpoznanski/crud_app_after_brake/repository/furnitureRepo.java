package pl.itpoznanski.crud_app_after_brake.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.itpoznanski.crud_app_after_brake.entity.furniture;

@Repository
public interface furnitureRepo extends CrudRepository<furniture, Integer> {
}
