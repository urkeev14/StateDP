/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import model.example1.remotecontrol.impl.Off;
import model.example1.tv.TV;

/**
 *
 * @author urosv
 */
public class Client {
    
    public static void main(String[] args) {
        Off initialState = new Off();
        
        TV tv = new TV(initialState);
        
        //First time press
        tv.pressButton();
        
        //Second time press
        tv.pressButton();
    }
    
}
