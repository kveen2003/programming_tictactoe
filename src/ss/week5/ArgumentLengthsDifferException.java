package ss.week5;

public class ArgumentLengthsDifferException extends WrongArgumentException{

    private int argumentOne;
    private int argumentTwo;

    public ArgumentLengthsDifferException(int argumentOne, int argumentTwo){
        super();
        this.argumentOne = argumentOne;
        this.argumentTwo = argumentTwo;
    }


    @Override
    public String getMessage(){
        return "ArgumentLengthsDifferException, argument 1: " + argumentOne + " and argument 2: " + argumentTwo;
    }


}
