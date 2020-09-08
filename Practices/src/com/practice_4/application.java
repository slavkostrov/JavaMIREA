package com.practice_4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class application extends JFrame {

    JButton button_1 = new JButton("AC Milan");
    JButton button_2 = new JButton("Real Madrid");
    JLabel result = new JLabel("Result: 0 X 0", JLabel.CENTER);
    JLabel last_scorer = new JLabel("Last scorer: N/A", JLabel.CENTER);
    JLabel winner = new JLabel("Draw", JLabel.CENTER);
    private int milan_score = 0;
    private int madrid_score = 0;
    Font fnt = new Font("Times new roman", Font.BOLD, 20);
    application() {
        super("Practice 3");
        setLayout(new BorderLayout());
        setSize(400, 200);
        setResizable(false);
        add(winner,  BorderLayout.NORTH);
        add(result,  BorderLayout.CENTER);
        add(last_scorer,  BorderLayout.SOUTH);
        add(button_1, BorderLayout.EAST);
        add(button_2, BorderLayout.WEST);
        button_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                milan_score += 1;
                result.setText("Result: " + milan_score + " X " + madrid_score + " ");
                last_scorer.setText("Last scorer: AC Milan");
                if (madrid_score < milan_score){
                    winner.setText("AC Milan");
                }
                else if (milan_score == madrid_score)
                {
                    winner.setText("Draw");
                }
            }
        });
        button_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                madrid_score += 1;
                result.setText("Result: " + milan_score + " X " + madrid_score);
                last_scorer.setText("Last scorer: Real Madrid");
                if (madrid_score > milan_score){
                    winner.setText("Real Madrid");
                }
                else if (milan_score == madrid_score)
                {
                    winner.setText("Draw");
                }

            }
        });
        setVisible(true);
    }
}