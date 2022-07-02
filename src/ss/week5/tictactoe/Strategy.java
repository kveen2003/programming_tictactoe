package ss.week5.tictactoe;


public interface Strategy {


    public String getName();

    public int determineMove(ss.week4.tictactoe.Board board, ss.week4.tictactoe.Mark mark);


}
