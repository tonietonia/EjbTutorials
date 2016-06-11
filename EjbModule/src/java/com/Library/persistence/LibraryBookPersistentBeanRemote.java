
package com.Library.persistence;

import com.Library.entities.Book;
import java.util.List;
import javax.ejb.Remote;

/* @author Tonia */

@Remote
public interface LibraryBookPersistentBeanRemote {

    void addBook(Book bookName);

    List<Book> getBooks();

}
