package com.jovisco.tutorial.pti;

public class Computer {

    private Display displayService;


    public void setDisplayService(Display displayService) {
        this.displayService = displayService;
    }

    public void display(String message) {
        displayService.display(message);
    }
}
