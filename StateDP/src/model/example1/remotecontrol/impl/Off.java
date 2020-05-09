/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.example1.remotecontrol.impl;

import model.example1.remotecontrol.RemoteControl;
import model.example1.tv.TV;


public class Off extends RemoteControl {

    @Override
    public void pressSwitch(TV context) {
        System.out.println("I am off. Going to be on now...");
        context.setState(new On());
    }
    
}
