package com.flixit.exceptions;

public class MovieNotFoundException extends Exception {

    private static final long serialVersionUID = 4351720088030656859L;
    private int errorId;

    public int getErrorId() {
        return errorId;
    }

    public MovieNotFoundException(String msg, int errorId) {
        super(msg);
        this.errorId = errorId;
    }

    public MovieNotFoundException(String msg, Throwable cause) {
        super(msg, cause);
    }

}
