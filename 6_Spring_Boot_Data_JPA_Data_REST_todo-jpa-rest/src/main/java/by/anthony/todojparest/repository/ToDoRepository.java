package by.anthony.todojparest.repository;

import by.anthony.todojparest.domain.ToDo;
import org.springframework.data.repository.CrudRepository;

public interface ToDoRepository extends CrudRepository<ToDo, String> {
}
