package com.jovisco.tutorial.patterns.mediator;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class LoginButton extends JButton implements Component {

    private final Mediator mediator;

    public LoginButton(Mediator mediator) {
        super("Login");
        this.mediator = mediator;
    }

    protected void fireActionPerformed(ActionEvent actionEvent) {
        mediator.login();
    }

    @Override
    public String getName() {
        return "LoginButton";
    }
}
