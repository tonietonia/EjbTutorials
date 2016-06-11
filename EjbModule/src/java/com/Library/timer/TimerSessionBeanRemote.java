
package com.Library.timer;

import javax.ejb.Remote;

/* @author Tonia */

@Remote
public interface TimerSessionBeanRemote {

    public void createTimer(long milliseconds);

}
