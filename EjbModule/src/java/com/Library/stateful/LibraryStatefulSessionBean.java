
package com.Library.stateful;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.PostActivate;
import javax.ejb.PrePassivate;
import javax.ejb.Stateful;


/* @author Tonia */

@Stateful
public class LibraryStatefulSessionBean implements LibraryStatefulSessionBeanRemote {

    List<String> bookShelf;

    public LibraryStatefulSessionBean() {
        bookShelf = new ArrayList<String>();
    }

    public void addBook(String bookName) {
        bookShelf.add(bookName);
    }

    public List<String> getBooks() {
        return bookShelf;
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("LibraryStatefulSessionBean.postConstruct::"
                + " bean created.");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("LibraryStatefulSessionBean.preDestroy:"
                + " bean removed.");
    }

    @PostActivate
    public void postActivate() {
        System.out.println("LibraryStatefulSessionBean.postActivate:"
                + " bean activated.");
    }

    @PrePassivate
    public void prePassivate() {
        System.out.println("LibraryStatefulSessionBean.prePassivate:"
                + " bean passivated.");
    }
}
