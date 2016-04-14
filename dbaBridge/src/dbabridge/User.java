/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbabridge;

/**
 *
 * @author Hayden Szymanski
 */
public class User {
    private String userEmail, userPassword;
    
    public User(String assignUserEmail, String assignUserPassword)
    {
        userEmail = assignUserEmail;
        userPassword = assignUserPassword;
    }
    
    /**
     * Precondition: Password has been set in constructor
     * Postcondition: String for password is now replaced with hashed version
     */
    public void hashUserPassword()
    {
        
    }
    
    
}
