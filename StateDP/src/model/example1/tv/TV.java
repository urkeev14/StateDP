/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.example1.tv;

import model.example1.remotecontrol.RemoteControl;

/**
 *
 * @author urosv
 */
public class TV {
    
    private RemoteControl state;

    public TV(RemoteControl state) {
        this.state = state;
    }

    public RemoteControl getState() {
        return state;
    }

    public void setState(RemoteControl state) {
        this.state = state;
    }
    
    public void pressButton(){
        state.pressSwitch(this);
    }
    
    
    
}
