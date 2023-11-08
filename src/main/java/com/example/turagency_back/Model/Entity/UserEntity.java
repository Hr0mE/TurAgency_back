package com.example.turagency_back.Model.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "User")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String login;
    private String password;
    @Transient
    private String passwordConfirm;

    private Integer access;
    private Integer buys_id;
    private Integer personal_ifo_id;

    public UserEntity() {

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

    public void setBuys_id(Integer buys_id) {
        this.buys_id = buys_id;
    }

    public void setPersonal_ifo_id(Integer personal_ifo_id) {
        this.personal_ifo_id = personal_ifo_id;
    }
}
