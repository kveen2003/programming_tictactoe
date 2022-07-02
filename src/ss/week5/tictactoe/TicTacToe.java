package ss.week5.tictactoe;
import ss.utils.TextIO;


public class TicTacToe {

    public static void main(String[] args) {
        
        String name1;
        String name2;
        
//        String input = TextIO.getlnString();
        
        if(args.length == 0){
            System.out.println("Name player 1:");
            name1 = TextIO.getlnString();
            System.out.println("Name player 2:");
            name2 = TextIO.getlnString();
        } else if(args.length == 1){
            name1 = args[0];
            System.out.println("Name player 2:");
            name2 = TextIO.getlnString();
        } else {
            name1 = args[0];
            name2 = args[1];
        }

        Player player1;
        Player player2;
        
        switch(name1){
            case "-N": 
                player1 = new ComputerPlayer(ss.week4.tictactoe.Mark.XX);
                break;
            case "-S":
                player1 = new ComputerPlayer(ss.week4.tictactoe.Mark.XX, new SmartStrategy());
                break;
            default:
                player1 = new HumanPlayer(name1, ss.week4.tictactoe.Mark.XX);
        }
        
        switch(name2){
            case "-N":
                player2 = new ComputerPlayer(ss.week4.tictactoe.Mark.OO);
                break;
            case "-S":
                player2 = new ComputerPlayer(ss.week4.tictactoe.Mark.OO, new SmartStrategy());
                break;
            default:
                player2 = new HumanPlayer(name2, ss.week4.tictactoe.Mark.OO);
        }
        

//        if(args.length == 0) {
//            String[] names = name();
//            switch (names[0]) {
//                case "-N":
//                    player1 = new ComputerPlayer(ss.week4.tictactoe.Mark.XX, new NaiveStrategy());
//                    player2 = new HumanPlayer(names[1], ss.week4.tictactoe.Mark.OO);
//                    break;
//                case "-S":
//                    break;
//                default:
//                    player1 = new HumanPlayer(names[0], ss.week4.tictactoe.Mark.XX);
//                    player2 = new HumanPlayer(names[1], ss.week4.tictactoe.Mark.OO);
//                    break;
//            }
//        } else if (args.length ==1){
//            
//            
//        
//
//        } else {
//            switch (args[0]) {
//                case "-N":
//                    player1 = new ComputerPlayer(ss.week4.tictactoe.Mark.XX, new NaiveStrategy());
//                    player2 = new HumanPlayer(args[1], ss.week4.tictactoe.Mark.OO);
//                    break;
//                case "-S":
//                    System.out.println("S");
//                    break;
//                default:
//                    player1 = new HumanPlayer(args[0], ss.week4.tictactoe.Mark.XX);
//                    player2 = new HumanPlayer(args[1], ss.week4.tictactoe.Mark.OO);
//                    break;
//            }
//        }
//
        Game game = new Game(player1, player2);
        game.start();
//
//
//
    }
//
//
//    public static String[] name(){
//        String[] bothNames = new String[2];
//        System.out.println("Name first player:");
//        bothNames[0] = TextIO.getlnString();
//        System.out.println("Name second player:");
//        bothNames[1] = TextIO.getlnString();
//        return bothNames;
//    }

}
