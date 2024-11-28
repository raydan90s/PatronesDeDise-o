/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package FactoryMethod;

/**
 *
 * @author Lenovo
 */
public class Member {

    public CreditCard getCard(String type){
        CreditCard credit = null;
        if (type.equals("Basic")) new FactoryBasicCard().createCard();
        else if (type.equals("PremiumCard")) new FactoryPremiumCard().createCard();
        else if (type.equals("VipCard")) new FactoryVipCard().createCard();
        
        return credit;
        
    }
}
