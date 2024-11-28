/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facade;

/**
 *
 * @author Lenovo
 */
public class Facade {
    WebSubsystem web;
    MovilSubsystem movil;
    PhoneSubsystem phone;
    
    public Facade(){
        web = new WebSubsystem();
        movil = new MovilSubsystem();
        phone = new PhoneSubsystem();
    }
    
    public void doTransacction(){
        web.webTransaction();
        movil.movilTransaction();
        phone.phoneTransaction();
    }
    
}
