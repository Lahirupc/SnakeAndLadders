/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snl;

import java.awt.EventQueue;
import javax.swing.JFrame;


public class Run extends JFrame {
    
    public Run() {

        initUI();
    }

    private void initUI() {
        setSize(800, 800);
        //pack();
        
        setTitle("Snakes and Ladders");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //centers the window on the screen.
        setLocationRelativeTo(null);
    }    
    
    public static void main(String[] args) {
        //creating the board according to the randomly generated map
        Board.initializeBoard();
        Jumper.placeJumpers(7, 6);     
        Board.printBoardMap();
        System.out.println("Board ready"); 
        
        // Creating payers
        Player player1 = new Player("Lahiru");
        System.out.println(player1.getName()+" has joined the game!");
        Player player2 = new Player("Kasun");
        System.out.println(player2.getName()+" has joined the game!");
        
        Player curPlayer;
        for(int i=1; i<=100;i++){
            //setting the current player
            curPlayer = (i%2==0)? player1 : player2;
            int top = Die.roll();
            System.out.println("Die:"+top);
            
            int curPosition = curPlayer.getPosition();
            curPosition = curPosition + top;
            if(curPosition>=100){
                System.out.println("Player "+ curPlayer.getName() +" has won!");
                break;
            }else{
                curPosition = Board.getBoardMapOutput(curPosition);
                curPlayer.setPosition(curPosition);
            }
            
            System.out.println(curPlayer.getName()+": "+curPosition);
        }
        
        EventQueue.invokeLater(() -> {
            Run ex = new Run();
            ex.add(new BoardLayout());
            ex.setVisible(true);
        });
    }
}
