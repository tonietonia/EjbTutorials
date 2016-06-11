
package com.Library.webservice;

import com.Library.entities.Books;
import java.util.List;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/* @author Tonia */

@Stateless
@WebService(serviceName = "LibraryService")

public class LibraryBooksWebserviceBean implements LibraryBooksWebserviceBeanRemote {

    public LibraryBooksWebserviceBean() {
    }
    @PersistenceContext(unitName = "EjbModulePU")
    private EntityManager entityManager;

    public void addBook(Books book) {
        entityManager.persist(book);
    }

    @WebMethod(operationName = "getBooks")
    public List<Books> getBooks() {
        return entityManager.createQuery("From Books").getResultList();
    }

}
