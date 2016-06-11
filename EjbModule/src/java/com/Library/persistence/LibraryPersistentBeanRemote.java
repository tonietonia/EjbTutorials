
package com.Library.persistence;

import com.Library.entities.Bookblob;
import com.Library.entities.BookEmbeddable;
import javax.ejb.Remote;
import com.Library.entities.Books;
import java.util.List;

/* @author Tonia */

@Remote
public interface LibraryPersistentBeanRemote {

    void addBook(Books bookName);

    List<Books> getBooks();
    
    void addBookEmbeddable(BookEmbeddable bookName);

    List<BookEmbeddable> getBookEmbeddable();

    void addBookBlob(Bookblob book);

    List<Bookblob> getBookBlob();
    
//    void addBookQuery(Bookuery bookName);
//    List<BookQuery> getBookQuery();
}
