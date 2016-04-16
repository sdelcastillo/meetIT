/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.sam.meetit;

/**
 * @author Hayden Szymanski
 * Parent class for any user of the system, do not instantiate directly
 * Will likely remove interface in future
 */
public class User implements Connectable {
    private String userEmail, userPassword;
    
    
    public User(String assignUserEmail, String assignUserPassword)
    {
        userEmail = assignUserEmail;
        userPassword = assignUserPassword;
        this.hashUserPassword();
    }
    
    /**
     * Precondition: Password has been set in constructor
     * Postcondition: String for password is now replaced with hashed version
     */
    private void hashUserPassword()
    {
        
    }
    
    public String getUserEmail()
    {
        return userEmail;
    }
    
    public void setUserEmail(String newUserEmail)
    {
        userEmail = newUserEmail;
    }
    
    
}
