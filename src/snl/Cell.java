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

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Cell extends JPanel {
    int number;
    private Image imageObj;
    
    //cellType = 0    -> none
    //cellType = 1    -> Snake
    //cellType = 2    -> Ladder
    public Cell(int cellType, int number) {
        this.number = number;
        initBoard(cellType);
    }
    
    private void initBoard(int cellType) {
        switch (cellType) {
            case 1:
                loadSnake();
                break;
            case 2:
                loadLadder();
                break;
            default:
                loadNormal();
                break;
        }
        
        int w = imageObj.getWidth(this);
        int h =  imageObj.getHeight(this);
        setPreferredSize(new Dimension(w, h));        
    }
    
    private void loadSnake() {
        ImageIcon ii = new ImageIcon("src/resources/snake.jpg");
        imageObj = ii.getImage();
    }
    
        private void loadLadder() {
        ImageIcon ii = new ImageIcon("src/resources/ladder.jpg");
        imageObj = ii.getImage();
    }
    
        
    private void loadNormal() {
        ImageIcon ii = new ImageIcon("src/resources/square.jpg");
        imageObj = ii.getImage();
        
    }
        
    @Override
    public void paintComponent(Graphics g) {
        g.drawImage(imageObj, 0, 0, null);
        g.drawString(Integer.toString(number), 10, 10);
    }
    
    
    
}