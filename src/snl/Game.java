/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snl;

/**
 *
 * @author Xome
 */
public class Game {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
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
        
        
        
        
    }
}
