package com.example.turagency_back.Model.DAO;

import com.example.turagency_back.Model.Entity.UserEntity;
import com.example.turagency_back.Model.UserTest;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserDAO {
    private static int USERS_COUNT;
    private List<UserTest> users;

    {
        users = new ArrayList<>();
        users.add(new UserTest(++USERS_COUNT, "tom"));
        users.add(new UserTest(++USERS_COUNT, "pit"));
        users.add(new UserTest(++USERS_COUNT, "bull"));
    }

    public List<UserTest> index() {
        return users;
    }

    // Через лямбда-функцию находим пользователя и возвращаем его
    public UserTest show(long id){
        return users.stream().filter(user -> user.getId() == id).findAny().orElse(null);
    }
}
