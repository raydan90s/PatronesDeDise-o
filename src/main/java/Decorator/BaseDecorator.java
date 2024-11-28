/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator;

/**
 *
 * @author Lenovo
 */
public abstract class BaseDecorator implements Notifier{
    private Notifier notifier;
    
    public BaseDecorator(Notifier notifier){
        this.notifier = notifier;
    }
    
    public void send(){
        notifier.send();
    }
}
