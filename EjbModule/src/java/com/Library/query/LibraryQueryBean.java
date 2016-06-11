
package com.Library.query;

import com.Library.entities.BookQ;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/* @author Tonia */

@Stateless
public class LibraryQueryBean implements LibraryQueryBeanRemote {

    @PersistenceContext(unitName = "EjbModulePU")
    private EntityManager entityManager;

    public void addBookQuery(BookQ book) {

        entityManager.persist(book);

    }

    public List<BookQ> getBookQuery() {

//        Query q2 = entityManager.createQuery("SELECT b FROM BookQ b");
//        return q2.getResultList();
        //create an ejbql expression
        String ejbQL = "From BookQ b where b.name like ?1";
        //create query
        Query query = entityManager.createQuery(ejbQL);
        //substitute parameter.
        query.setParameter(1, "%test%");
        //execute the query
        return query.getResultList();

    }
}
