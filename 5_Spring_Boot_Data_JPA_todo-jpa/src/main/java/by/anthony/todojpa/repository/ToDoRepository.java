package by.anthony.todojpa.repository;

import by.anthony.todojpa.domain.ToDo;
import org.springframework.data.repository.CrudRepository;

public interface ToDoRepository extends CrudRepository<ToDo, String> {
}
