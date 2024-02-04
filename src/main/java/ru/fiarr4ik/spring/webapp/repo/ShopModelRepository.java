package ru.fiarr4ik.spring.webapp.repo;

import org.springframework.data.repository.CrudRepository;
import ru.fiarr4ik.spring.webapp.models.ShopModel;

public interface ShopModelRepository extends CrudRepository<ShopModel ,Long> {
}
