package by.anthony.todomongo.repository;

import by.anthony.todomongo.domain.ToDo;
import org.springframework.data.repository.CrudRepository;

public interface ToDoRepository extends CrudRepository<ToDo, String> {
}
