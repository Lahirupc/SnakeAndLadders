/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snl;

import java.awt.GridLayout;
import javax.swing.JPanel;

/**
 *
 * @author Lahiru
 */
public class BoardLayout extends JPanel{
    //private static JPanel panel; 
    
    public BoardLayout(){
        //panel = new JPanel();
        setLayout();
    }
    
    public void setLayout(){
        this.setLayout(new GridLayout(10, 10, 0, 0));
        
        for(int i = 1; i<=100; i++){
            if(i > Board.getBoardMapOutput(i)){
                // set snake cell
                this.add(new Cell(1, i));
            }else if(i < Board.getBoardMapOutput(i)){
                //set Ladder cell
                this.add(new Cell(2, i));
            }else{
                //set normal cell
                this.add(new Cell(0, i));
            }
        }
    }
    
}
