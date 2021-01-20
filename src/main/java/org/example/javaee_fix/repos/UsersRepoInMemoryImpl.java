package org.example.javaee_fix.repos;

import org.example.javaee_fix.fake.FakeStorage;
import org.example.javaee_fix.models.User;
import java.util.List;

public class UsersRepoInMemoryImpl implements UsersRepo {

    @Override
    public List<User> findAll() {
        return FakeStorage.storage().users();
    }

    @Override
    public void save(User user) {
        FakeStorage.storage().users().add(user);
    }

    @Override
    public boolean isExist(String name,  String password) {
        return null != FakeStorage.storage().users().stream().filter(user ->
                user.getName().equals(name) &&
                user.getPassword().equals(password)).findAny().orElse(null);
    }
}
