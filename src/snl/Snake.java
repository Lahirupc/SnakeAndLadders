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
public class Snake extends Jumper {
    private static int noSnakes = 0;
    
    public Snake(int start, int end){
        super(start, end);
        this.noSnakes++;
    }
    
    public Snake(){
        //Setting random position for the Snake
        int n1 = Calculator.randomNumberInRange(6, 99);
        int n2 = Calculator.randomNumberInRange(3, n1-3);
        super.startingPoint = n1;
        super.endingPoint = n2;
    }

}
