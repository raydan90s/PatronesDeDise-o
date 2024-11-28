/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryMethod;

/**
 *
 * @author Lenovo
 */
public class FactoryPremiumCard implements FactoryCard{

    @Override
    public CreditCard createCard() {
        return new PremiumCard();
    }
    
    
}
