package ss.week4.tictactoe;

import ss.utils.TextIO;

public class TicTacToe {

    public static void main(String[] args) {
        Player player1;
        Player player2;

        if(args.length == 2){
            player1 = new HumanPlayer(args[0], Mark.XX);
            player2 = new HumanPlayer(args[1], Mark.OO);
        } else {
            String[] names = name();
            player1 = new HumanPlayer(names[0], Mark.XX);
            player2 = new HumanPlayer(names[1], Mark.OO);
        }

        Game game = new Game(player1, player2);
        game.start();



    }

    public static String[] name(){
        String[] bothNames = new String[2];
        System.out.println("Name first player:");
        bothNames[0] = TextIO.getlnString();
        System.out.println("Name second player:");
        bothNames[1] = TextIO.getlnString();
        return bothNames;
    }

}
