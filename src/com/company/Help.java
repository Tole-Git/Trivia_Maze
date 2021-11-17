package com.company;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Help extends JFrame {
    private JPanel menuPanelNorth;
    private JPanel menuPanelSouth;
    private JPanel menuPanelCenter;
    private JLabel setLabel;

    private static final int myWidth = 500;
    private static final int myLength = 300;
    public Help(){
        //System.out.println("In Help");
        setSize(myWidth,myLength);
        setTitle("Help");
        setLocationRelativeTo(null);

        //create items
        var howToPlayButton = new JButton("How To Play");
        var controlsButton = new JButton("Controls");
        var exitButton = new JButton("Exit");
        setLabel = new JLabel("", SwingConstants.CENTER);
        setLabel.setText("Type How to play here.");

        menuPanelNorth = new JPanel();
        menuPanelCenter = new JPanel();
        menuPanelSouth = new JPanel();
        menuPanelCenter.setLayout(new GridLayout(1,0));

        //add buttons and text input
        menuPanelNorth.add(howToPlayButton);
        menuPanelNorth.add(controlsButton);
        menuPanelCenter.add(setLabel);
        menuPanelSouth.add(exitButton);

        //add panel to frame
        add(menuPanelNorth, BorderLayout.NORTH);
        add(menuPanelCenter, BorderLayout.CENTER);
        add(menuPanelSouth, BorderLayout.SOUTH);

        //create button action
        var howToAction = new HowToAction();
        var controlsAction = new ControlsAction();
        var exitAction = new ExitAction();

        //associate action with button
        howToPlayButton.addActionListener(howToAction);
        controlsButton.addActionListener(controlsAction);
        exitButton.addActionListener(exitAction);

        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public void SetHelpHowTo(){

        setLabel.setText("Type How to play here.");

    }

    public void SetHelpControls(){

        setLabel.setText("Type the final controls here.");

    }


    private class HowToAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            SetHelpHowTo();
        }
    }

    private class ControlsAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            SetHelpControls();
        }
    }

    private class ExitAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            dispose();
        }
    }

}
