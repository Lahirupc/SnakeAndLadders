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
public class Ladder extends Jumper {
    private static int noLadders;

    public Ladder(int start, int end){
        super(start, end);
        this.noLadders++;
    }
    
    public Ladder(){
        //Setting random position for the Ladder
        //min length is 3
        int n1 = Calculator.randomNumberInRange(1, 94);
        int n2 = Calculator.randomNumberInRange(n1+3, 100);
        
        super.startingPoint = n1;
        super.endingPoint = n2;
    }
    
    
}
