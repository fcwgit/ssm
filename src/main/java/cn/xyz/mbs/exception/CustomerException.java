package cn.xyz.mbs.exception;

/**
 * Created by fanchengwei on 2017/7/31.
 */
public class CustomerException extends Exception{

    public String message;

    @Override
    public String getMessage() {
        System.out.println("");
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public CustomerException(String message){
        super(message);
        this.message = message;

    }

}
