package com.Library.stateful;

import java.util.List;
import javax.ejb.Remote;

/* @author Tonia */

@Remote
public interface LibraryStatefulSessionBeanRemote {

    void addBook(String bookName);

    List getBooks();

}
