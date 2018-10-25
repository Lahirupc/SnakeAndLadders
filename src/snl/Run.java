/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snl;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JFrame;

import java.awt.GridLayout;

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
        
        Board.initializeBoard();
        System.out.println("jumpers ready");
        Jumper.placeJumpers(7, 6);
        
        Board.printBoardMap();

        Player player1 = new Player("Lahiru");
        System.out.println("lahiru");
        
        for(int i=1; i<=30;i++){
            int top = Die.roll();
            System.out.println("D:"+top);
            
            int curPosition = player1.getPosition();
            curPosition = curPosition + top;
            if(curPosition>=100){
                System.out.println("Player "+ player1.getName() +" has won!");
                break;
            }else{
                curPosition = Board.getBoardMapOutput(curPosition);
                player1.setPosition(curPosition);
            }
            
            System.out.println("Lahiru:"+curPosition);
        }
        
        EventQueue.invokeLater(() -> {
            Run ex = new Run();
            ex.add(new BoardLayout());
            ex.setVisible(true);
        });
    }
}
