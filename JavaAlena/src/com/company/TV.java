package com.company;

public class TV implements remote_controller {

    @Override
    public void turn_on() {
        System.out.println("Turning on");
    }

    @Override
    public void turn_off() {
        System.out.println("Turning off");
    }

    @Override
    public void muted() {
        System.out.println("Volume 0");
    }

    @Override
    public void unmuted() {
        System.out.println("Oh my God, so load");
    }
}
