/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.bdd.form;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;

/**
 *
 * @author user
 */
public class Progress extends JFrame {

    JProgressBar current;
    JTextArea out;
    JButton find;
    Thread runner;
    int num = 0;

    public void Progress() {
      

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel pane = new JPanel();
        pane.setLayout(new FlowLayout());
        current = new JProgressBar(0, 29300);
        current.setValue(0);
        current.setStringPainted(true);
        pane.add(current);
        setContentPane(pane);
    }

    public void iterate() {
        while (num < 29300) {
            current.setValue(num);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            num += 3000;
        }
    }

    public static void main(String[] arguments) {
        Progress frame = new Progress();
        frame.pack();
        frame.setVisible(true);
        frame.iterate();
    }
}
