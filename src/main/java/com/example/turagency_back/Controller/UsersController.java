package com.example.turagency_back.Controller;

import com.example.turagency_back.Controller.Service.UserService;
import com.example.turagency_back.Model.DAO.UserDAO;
import com.example.turagency_back.Model.Entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {

    //Внедряем ДАО через конструктор, можно через Autowired
    private final UserDAO userDAO;
    @Autowired
    public UsersController(UserDAO userDAO) {
        this.userDAO = userDAO;
    }
    @GetMapping()
    public String index(Model model){
        //model.addAttribute("users", userDAO.index());
        //return "index";
        try {
            return "empty";
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return "main";
    }

    @GetMapping("/{id}")
    public String show(@PathVariable("id") long id, Model model){
        model.addAttribute("users", this.userDAO.show(id));
        return "users/show";
    }




    /*
    private final UserService userService;
    @Autowired
    public UsersController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/get_user")
    public List<UserEntity> get_User(){
        return userService.get_User();
        }

     */


}