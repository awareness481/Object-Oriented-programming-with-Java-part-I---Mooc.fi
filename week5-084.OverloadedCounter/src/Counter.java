/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author p
 */
public class Counter {
    private int initial;
    private boolean check;    
    
    public Counter(int startingValue, boolean check) {
        this.initial = startingValue;
        this.check = check;
    }
    
    public Counter(int startingValue) {
        this(startingValue, false);
    }
    
    public Counter(boolean check) {
        this(0, check);
    }
    
    public Counter() {
        this(0, false);
    }
    
    public int value() {
        return this.initial;
    }
    
    public void increase() {
        this.initial++;
    }
    
    public void decrease() {
        if (check && this.initial == 0) {
            return;
        }
        this.initial--;
    }
    
    public void increase(int increaseAmount) {
        if (increaseAmount < 1) {
            return;
        }
        this.initial += increaseAmount;
    }
    
    public void decrease(int decreaseAmount) {
        if (decreaseAmount < 1) {
            return;
        }
        this.initial -= decreaseAmount;
        
        if (check && this.initial < 0) {
            this.initial = 0;
        }
    }
}
