
package com.Library.query;

import com.Library.entities.BookQ;
import java.util.List;
import javax.ejb.Remote;

/* @author Tonia */

@Remote
public interface LibraryQueryBeanRemote {

    void addBookQuery(BookQ bookName);

    List<BookQ> getBookQuery();
}
