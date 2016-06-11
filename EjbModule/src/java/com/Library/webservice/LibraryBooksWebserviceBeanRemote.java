

package com.Library.webservice;

import com.Library.entities.Books;
import java.util.List;
import javax.ejb.Remote;

/* @author Tonia */

@Remote
public interface LibraryBooksWebserviceBeanRemote {
    
    void addBook(Books bookName);

    List<Books> getBooks();
    
}
