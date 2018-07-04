package com.daphne.study.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "user")
public class UserEntity implements Serializable {

    @Id
    @Column(name = "userid")
    private String userID;

    @Column(name = "username")
    private String userName;

    @Column(name = "password")
    private String password;

    public UserEntity(String userID, String userName, String password) {
        this.userID = userID;
        this.userName = userName;
        this.password = password;
    }

    public UserEntity() {

    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "userID='" + userID + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
