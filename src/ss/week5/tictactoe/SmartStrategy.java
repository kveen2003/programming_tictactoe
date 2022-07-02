package ss.week5.tictactoe;

import ss.week4.tictactoe.Board;
import ss.week4.tictactoe.Mark;

import java.util.ArrayList;

public class SmartStrategy implements Strategy{


    @Override
    public String getName() {
        return "Smart";
    }

    @Override
    public int determineMove(Board board, Mark mark) {
        if (board.isEmptyField(4)) {
            return 4;
        } else{
            int smartWin = finGame(mark, board);
            int opponentWin = finGame(mark.other(), board);
            if(smartWin != -5){
                return smartWin;
            } else if(opponentWin != -5) {
                return opponentWin;
            } else {
                return randomMove(board);
            }
        }

    }

    public int finGame(Mark mark, Board board){
        Board thisBoard = new Board();
        for (int i = 0; i < 9; i++) {
            thisBoard.reset();
            thisBoard = board.deepCopy();

            if(thisBoard.isEmptyField(i)){
                thisBoard.setField(i, mark);
                if(thisBoard.hasWinner()){
                    return i;
                }
            }

        }
        return -5;
    }

    public int randomMove(Board board){
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
