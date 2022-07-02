package ss.week5.tictactoe;


import java.util.ArrayList;

public class NaiveStrategy implements Strategy{

    @Override
    public String getName() {
        return "Naive";
    }

    @Override
    public int determineMove(ss.week4.tictactoe.Board board, ss.week4.tictactoe.Mark mark) {
        ArrayList<Integer> availableMoves = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            if(board.isEmptyField(i)){
                availableMoves.add(i);
            }
        }
        int randomMove = ((int) Math.floor(Math.random() * availableMoves.size()));
        return availableMoves.get(randomMove);
    }
}
