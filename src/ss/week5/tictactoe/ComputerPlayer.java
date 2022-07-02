package ss.week5.tictactoe;


public class ComputerPlayer extends Player{
    private Strategy strategy;

    /**
     * Creates a new Player object.
     *
     * @param mark mark which to be changed
     * @param strategy kind of strategy
     * @requires name is not null
     * @requires mark is either XX or OO
     * @ensures the Name of this player will be name
     * @ensures the Mark of this player will be mark
     */
    public ComputerPlayer(ss.week4.tictactoe.Mark mark, Strategy strategy) {
        super(strategy.getName() + "-", mark);
        this.strategy = strategy;
    }


    public ComputerPlayer(ss.week4.tictactoe.Mark mark){
        this(mark, new NaiveStrategy());
    }


    @Override
    public int determineMove(ss.week4.tictactoe.Board board) {
        return strategy.determineMove(board, this.getMark());
    }

    public Strategy getStrategy(){
        return this.strategy;
    }
}
