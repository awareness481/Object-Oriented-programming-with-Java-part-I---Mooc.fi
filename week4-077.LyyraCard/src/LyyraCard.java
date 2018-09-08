/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author p
 */
public class LyyraCard {
    private double balance;

    public LyyraCard(double balanceAtStart) {
        // write code here
        this.balance = balanceAtStart;
    }
    
    public void payEconomical() {
    // write code here
        if (this.balance < 2.5) {
            return;
        }
    
        this.balance -= 2.5;
    }

    public void payGourmet() {
        // write code here
        if (this.balance < 4.0) {
            return;
        }
        
        this.balance -= 4.0;
    }
    
    public void loadMoney(double amount) {
        // write code here
        if (amount < 0) {
            return;
        }
        
        this.balance += amount;
        
        if (this.balance > 150.0) {
            this.balance = 150.0;
        }
    }

    public String toString() {
        // write code here
        return "The card has " + this.balance + " euros";
    }
}
