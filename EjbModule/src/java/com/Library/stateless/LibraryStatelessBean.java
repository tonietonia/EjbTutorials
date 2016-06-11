
package com.Library.stateless;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;

/* @author Tonia */

@Stateless
public class LibraryStatelessBean implements LibraryStatelessBeanRemote {

    List<String> bookShelf;
    
    public LibraryStatelessBean() {
        
        bookShelf = new ArrayList<String>();
        
    }

    public LibraryStatelessBean(List<String> bookShelf) {
        this.bookShelf = bookShelf;
    }

    
    
    public void addBook(String bookName) {
        bookShelf.add(bookName);
    }

    public List getBooks() {
        return bookShelf;
    }
}
