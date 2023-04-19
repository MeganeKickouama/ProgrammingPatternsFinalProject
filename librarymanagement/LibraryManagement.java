/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package librarymanagement;

/**
 *
 * @author szakr
 */
public class LibraryManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LogInFactory loginFact = new LogInFactory();
        Account acc;
        String[] accounts = {
            "123456",
            "134567",
            "213456",
            "245678",
            "345678",
            "398678"
        };
        
        for (String account : accounts) {
            acc = loginFact.createAccountType(account);
            
        }
        
        System.out.println(Library.supplierDatabase);
    }
    
}
