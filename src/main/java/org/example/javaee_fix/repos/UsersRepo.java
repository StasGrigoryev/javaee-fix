package org.example.javaee_fix.repos;

import org.example.javaee_fix.models.User;
import java.util.List;

public interface UsersRepo {
    List<User> findAll();
    void save(User user);
    boolean isExist(String name, String password);
}
