/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdemo;

/**
 *
 * @author Sadia
 */
class usertable {
    private int UserId,UserContact ;
    private String UserName,Roles; 
    public usertable(int UserId,String UserName,int UserContact, String Roles)
    {
        this.UserId = UserId;
        this.UserName = UserName;
        this.UserContact= UserContact;
        this.Roles = Roles;
        
    }
    public int getuserid()
    {
        return UserId;
    }
     
    public String getuname()
    {
        return UserName;
    }
    public int getucontact()
    {
        return UserContact ;
    }
    public String getrole()
    {
        return Roles;
    }
    
}
