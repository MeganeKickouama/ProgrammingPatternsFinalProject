/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanagement;

import java.util.Hashtable;

/**
 * @author szakr
 * @author kmega
 */
public class Library {

    public static Library instance = null;
    
    static Hashtable<Integer, Book> bookDatabase = new Hashtable<>();
    static Hashtable<Integer, User> userDatabase = new Hashtable<>();
    static Hashtable<Integer, Supplier> supplierDatabase = new Hashtable<>();
    static Hashtable<Integer, Staff> staffDatabase = new Hashtable<>();


    static final String databaseFile = "";

    private Library()
    {
        
    }

    public static Library getLibrary()
    {
        if (instance == null)
        {
            return new Library();
        }

        return instance;
    }

    public static void reserialize()
    {

    }
}
