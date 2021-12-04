
package com.mycompany.ch9.cLab16;

/**
 *
 * @author ziping
 */
public class FullQueueException extends RuntimeException {
    // create a full queue exception
    public FullQueueException(String queue) {
        super("The " + queue + " is full.");
    }
}
