package DAO;

import java.sql.SQLException;
import java.util.List;

public interface DAO <T>{

    T get(int id);

    List<T> getAll();

    void add(T t);

    void remove(T t);

    void update(T t);

}
