/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snl;

import java.util.HashMap;

/**
 *
 * @author Xome
 */
public class Board {
    private static HashMap<Integer, Integer> boardMap = new HashMap<>();
    // Initializing the board without Ladders and Snakes
    
    
    public static void initializeBoard() {
        for(int i=1; i<=100; i++){
            //System.out.println(i);
            boardMap.put(i, i);
        }
    }
    
    /**
     * @return the boardMap
     */
    public static int getBoardMapOutput(int key) {
        return boardMap.get(key);
    }

    /**
     * @param aBoardMap the boardMap to set
     */
    public static void setBoardMapOutput(int key, int value) {
        boardMap.put(key, value);
    }
        
    public static void printBoardMap(){
        System.out.println(boardMap);
        
    }
}
