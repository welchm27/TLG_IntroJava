package com.entertainment;

/*
 * Application-specific custom exception class - CHECKED EXCEPTION.
 */
public class InvalidVolumeException extends Exception {

    // 4 standard ctors
    public InvalidVolumeException() {           // super(); is automatically called.  Can enter it or leave it out.
    }

    public InvalidVolumeException(String message) {
        super(message);
    }

    public InvalidVolumeException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidVolumeException(Throwable cause) {
        super(cause);
    }
}