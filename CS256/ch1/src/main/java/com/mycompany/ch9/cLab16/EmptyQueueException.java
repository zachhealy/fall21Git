
package com.mycompany.ch9.cLab16;

/**
 *
 * @author ziping
 */
public class EmptyQueueException extends RuntimeException {
    // create an empty queue exception
    public EmptyQueueException(String queue) {
        super("The " + queue + " is empty.");
    }
}
