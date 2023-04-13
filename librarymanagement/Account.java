/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanagement;

/**
 *
 * @author szakr
 */
public class Account {
    
    private String username;
    private String password;
    private String email;
    private String phone;
    private int id; 
    //some fields may be unnecessary, feel free to make it redundant
   

    public Account(String username, String password, String email, String phone, int id)
    {
        this.username = username;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.id = id;
    }

    
     public Book searchBook(String bookTitle) 
     {
        // Code to search for a book in the library
     }
    
    //Will add getters and setters for all fields later

}
