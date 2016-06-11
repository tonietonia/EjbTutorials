
package com.Library.interceptor;

import java.util.List;
import javax.ejb.Remote;

/* @author Tonia */

@Remote
public interface LibraryBeanRemote {

    void addBook(String bookName);

    List getBooks();

}
