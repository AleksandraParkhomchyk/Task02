package by.tc.task01.dao;

public class DaoException extends Exception{

    public DaoException() {
        super();
    }

    public DaoException(String message){
        super(message);
    }

    /*public DaoException(Exception e){
        super(e);
    }*/

    public DaoException(String message, Exception e){
        super(message, e);
    }

    public DaoException(Throwable cause){
        super(cause);
    }
}
