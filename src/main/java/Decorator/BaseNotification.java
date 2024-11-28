/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator;

/**
 *
 * @author Lenovo
 */
public class BaseNotification implements Notifier{

    @Override
    public void send() {
        System.out.println("Enviado desde Base");
    }
    
    
}
