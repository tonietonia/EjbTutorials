
package com.Library.stateless;

import java.util.List;
import javax.ejb.Remote;

/* @author Tonia */

@Remote
public interface LibraryStatelessBeanRemote {

    void addBook(String bookName);

    List getBooks();
}
