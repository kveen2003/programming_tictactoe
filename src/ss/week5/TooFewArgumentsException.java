package ss.week5;

public class TooFewArgumentsException extends WrongArgumentException{

    public TooFewArgumentsException(){
        super();
    }

    @Override
    public String getMessage() {
        return "TooFewArgumentsException";
    }


}
