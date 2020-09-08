package com.practice_4.app;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class application extends JFrame {

    JButton button_1 = new JButton("AC Milan");
    JButton button_2 = new JButton("Real Madrid");
    JLabel result = new JLabel("Result: 0 X 0");
    JLabel last_scorer = new JLabel("Last scorer: N/A");
    private int milan_score = 0;
    private int madrid_score = 0;
    Font fnt = new Font("Times new roman", Font.BOLD, 20);

    application() {
        super("Practice 3");
        setLayout(new FlowLayout());
        setSize(250, 150);
        add(result,  BorderLayout.EAST);
        add(last_scorer,  BorderLayout.WEST);
        add(button_1);
        add(button_2);
        button_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                milan_score += 1;
                result.setText("Result: " + milan_score + " X " + madrid_score);
                last_scorer.setText("AC Milan");
            }
        });
        button_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                madrid_score += 1;
                result.setText("Result: " + milan_score + " X " + madrid_score);
                last_scorer.setText("Real Madrid");
            }
        });
        setVisible(true);
    }
}