
package com.Library.rawdatabase;

import com.Library.model.Bookss;
import java.util.List;
import javax.ejb.Remote;

/* @author Tonia */

@Remote
public interface LibraryBookssPersistentBeanRemote {

    void addBook(Bookss bookName);

    List<Bookss> getBooks();
}
