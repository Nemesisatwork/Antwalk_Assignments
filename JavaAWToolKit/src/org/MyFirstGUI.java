package org;

import java.awt.*;

public class MyFirstGUI extends Frame {

    public MyFirstGUI() {
        Button b1 = new Button("Click here");
        b1.setBounds(30, 100, 100, 30);
        setSize(500, 500);
        setBackground(Color.CYAN);
        setLayout(null);
        setVisible(true);
    }
}
