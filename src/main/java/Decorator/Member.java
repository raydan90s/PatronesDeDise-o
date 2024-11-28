/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator;

/**
 *
 * @author Lenovo
 */
public class Member {
    public static void main(String[] args) {
        Notifier notification = new BaseNotification();
        
        notification = new SMSDecorator(notification);
        
        notification = new WhatsAppDecorator(notification);
        
        notification = new TelegramDecorator(notification);
        
        notification.send();
        
        
    }
    
}
