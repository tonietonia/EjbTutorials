
package com.Library.message;

import com.Library.entities.Books;
import com.Library.persistence.LibraryPersistentBeanRemote;
import javax.annotation.Resource;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.EJB;
import javax.ejb.MessageDriven;
import javax.ejb.MessageDrivenContext;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;

/* @author Tonia */

@MessageDriven(
        name = "BookMessageHandler",
        activationConfig = {
            @ActivationConfigProperty(propertyName = "destinationType",
                    propertyValue = "javax.jms.Queue"),
            @ActivationConfigProperty(propertyName = "destination",
                    propertyValue = "/queue/BookQueue")
        }
)


public class LibraryMessageBean implements MessageListener {

    @Resource
    private MessageDrivenContext mdctx;
    
    @EJB
    LibraryPersistentBeanRemote libraryBean;

    public LibraryMessageBean() {
    }

    public void onMessage(Message message)  {
        ObjectMessage objectMessage = null;
        try {
            objectMessage = (ObjectMessage) message;
            Books book = (Books) objectMessage.getObject();
            libraryBean.addBook(book);
        }
        
        catch (JMSException ex) {
        mdctx.setRollbackOnly();
}
    }
}
