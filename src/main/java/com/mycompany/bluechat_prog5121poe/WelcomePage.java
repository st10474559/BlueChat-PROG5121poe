/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bluechat_prog5121poe;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
/**
 *
 * @author manyi
 */
public class WelcomePage {
    JFrame frame = new JFrame();
    JLabel welcomeLabel = new JLabel("");
    
    WelcomePage(){
        
        welcomeLabel.setBounds(50,50,200,35);
        welcomeLabel.setFont(new Font(null,Font.PLAIN,25));
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(welcomeLabel);
    }
}
