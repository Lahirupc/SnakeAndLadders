/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snl;

/**
 *
 * @author Lahiru
 */
public class Die {
    private int topFace;
    public static int roll(){
        return Calculator.randomNumberInRange(1, 6);
    }
}
