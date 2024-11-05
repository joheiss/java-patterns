package com.jovisco.tutorial.patterns.mediator;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ForgotPasswordButton extends JButton implements Component {

    private Mediator mediator;

    public ForgotPasswordButton(Mediator mediator) {
        super("Forgot Password");
        this.mediator = mediator;
    }

    protected void fireActionPerformed(ActionEvent actionEvent) {
        mediator.forgotPassword();
    }

    @Override
    public String getName() {
        return "ForgotPasswordButton";
    }
}
