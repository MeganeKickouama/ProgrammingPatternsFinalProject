/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanagement;

import java.io.Serializable;

/**
 *
 * @author szakr
 */
public class Book implements Serializable {
    private String title;
    private String author;
    private int bookID;
    private int price;
    private static int count = 0;

    public Book(String title, String author, int price)
    {
        this.bookID = nextID();
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public static int nextID()
    {
        // to modify later, I am using this for a test
        count ++;
        return count;
    }


}
