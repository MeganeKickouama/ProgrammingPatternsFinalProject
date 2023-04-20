/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package librarymanagement;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

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
            "223432",
            "213456",
            "245678",
            "345678",
            "398678"
        };
        
        for (String account : accounts) {
            acc = loginFact.createAccountType(account);
            
        }
        //System.out.println("Supplier");
        //System.out.println("Key\t\tAccount ID      Password");
        //System.out.println(Library.supplierDatabase);

        Book test = new Book("Twilight", "Stephanie Meyer", 22);
        try 
        {
            FileOutputStream fout = new FileOutputStream("..\\database.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);

            out.writeObject(test);
            out.flush();

            out.close();
            System.out.println("success");
        } 
        catch (IOException e)
        {
            System.out.println(e);
        }
        Library.reserialize();
    }
    
}
