/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bluechat_prog5121poe;
import static java.awt.Color.green;
import static java.awt.Color.red;
import java.awt.Font;
import java.util.HashMap;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
/**
 *
 * @author manyi
 */
public class LoginPage implements ActionListener{
    
    JFrame frame = new JFrame();
    JButton loginButton = new JButton("Login");
    JButton registerButton = new JButton("Register");
    JTextField usernameField = new JTextField();
    JPasswordField userPasswordField = new JPasswordField();
    JLabel usernameLabel = new JLabel("Username:");
    JLabel userPasswordLabel = new JLabel("Password:");
    JLabel messageLabel = new JLabel();
    HashMap<String,String> logininfo = new HashMap<String,String>();
    
   LoginPage(HashMap<String,String>  logininfoOriginal){
    logininfo =logininfoOriginal;
    
    usernameLabel.setBounds(50,100,75,25);
    userPasswordLabel.setBounds(50,150,75,25);
    
    messageLabel.setBounds(125,250,250,35);
    messageLabel.setFont(new Font(null,Font.ITALIC,25));
    
    usernameField.setBounds(125,100,200,25);
    userPasswordField.setBounds(125,150,200,25);
    
    loginButton.setBounds(125,200,100,25);
    loginButton.addActionListener(this);
    
    registerButton.setBounds(225,200,100,25);
    registerButton.addActionListener(this);
    
    frame.add(loginButton);
    frame.add(registerButton);
    frame.add(usernameField);
    frame.add(userPasswordField);
    frame.add(usernameLabel);
    frame.add(userPasswordLabel);
    frame.add(messageLabel);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(420,420);
    frame.setLayout(null);
    frame.setVisible(true);
    
       
   }
   
    @Override
   public void actionPerformed(ActionEvent e){
       
       if(e.getSource()== registerButton){
           usernameField.setText(" ");
           userPasswordField.setText(" ");
   }
        if(e.getSource()== loginButton){ 
            
        String username = usernameField.getText();
        String password = String.valueOf(userPasswordField.getPassword());
        
        if(logininfo.containsKey(username)){
            if(logininfo.get(username).equals(password)){
                messageLabel.setForeground(green);
                messageLabel.setText("Login Successful");
                WelcomePage welcomePage = new WelcomePage();
            }
            else{
                 messageLabel.setForeground(red);
                 messageLabel.setText("Incorrect Password"); 
            }
        }
        else{
            messageLabel.setForeground(red);
            messageLabel.setText("Unknown User");
        }
        }
    }
}

