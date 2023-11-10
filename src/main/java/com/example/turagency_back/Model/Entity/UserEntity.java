package com.example.turagency_back.Model.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@Entity
@Table
public class UserEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String login;
    private String password;
    @Transient
    private String passwordConfirm;

    private Integer access;
    private Integer buys_id;

    private Integer personal_info_id;


    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", passwordConfirm='" + passwordConfirm + '\'' +
                ", access=" + access +
                ", buys_id=" + buys_id +
                ", personal_ifo_id=" + personal_info_id +
                '}';
    }

    public UserEntity() {

    }

    public UserEntity(long id,
                      String login,
                      String password,
                      String passwordConfirm,
                      Integer access,
                      Integer buys_id,
                      Integer personal_info_id) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.passwordConfirm = passwordConfirm;
        this.access = access;
        this.buys_id = buys_id;
        this.personal_info_id = personal_info_id;
    }

    public UserEntity(String login,
                      String password,
                      String passwordConfirm,
                      Integer access,
                      Integer buys_id,
                      Integer personal_info_id) {
        this.login = login;
        this.password = password;
        this.passwordConfirm = passwordConfirm;
        this.access = access;
        this.buys_id = buys_id;
        this.personal_info_id = personal_info_id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPasswordConfirm(String passwordConfirm) {
        this.passwordConfirm = passwordConfirm;
    }

    public void setAccess(Integer access) {
        this.access = access;
    }

    public void setPersonal_info_id(Integer personal_ifo_id) {
        this.personal_info_id = personal_ifo_id;
    }

    public void setBuys_id(Integer buys_id) {
        this.buys_id = buys_id;
    }


}
