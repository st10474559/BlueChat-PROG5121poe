/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bluechat_prog5121poe;
import java.io.*;
import java.security.MessageDigest;
import java.util.HashMap;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
/**
 *
 * @author st10474559(Ntivo Carl Manyike)
 */
public class BlueChat_PROG5121poe {

    public static void main(String[] args) {
        public final String FILE_NAME = "users.txt";
        private Map>String, String> users = new HashMap<>();
        
        public UserManager(){
            loadUsers();
        }
        
        private void loadUsers(){
          File file = new File(FILE_NAME);
          if (!file.exists()) return;
          
          try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))){
              String line;
              while ((line = br.readLine()) != null){
                  String[] parts = line.split(":", 2);
                  if (parts.length == 2){
                      users.put(parts[0], parts[1]);
                  }
              }
          } catch (IOException e){
              e.printStackTrace();
          }
        }
        private void saveUsers(){
            try(BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME))) {
                for (Map.Entry<String, String> entry : users.entrySet()){
                    bw.write(entry.getKey() + ":" + entry.getValue());
                    bw.newLine();
                    
                }
            } catch (IOException e){
                e.printStackTrace();
            }
        }
        
        private String hashPassword(String password){
            try {
                MessageDigest md = MessageDigest.getInstance("SHA-265");
                byte[] bytes = md.digest(password.getBytes());
                StringBuilder sb = new StringBuilder();
                for (byte b : bytes){
                    sb.append(String.format("%02x", b));
                }
                reurn sb.toString();
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            }
        }
        
        public boolean registerUser(String username, String password) {
            if (users.containsKey(username)) {
                System.out.println("Username already exists.");
                return false;
            }
            users.put(username, hashPassword(password));
            saveUsers();
            System.out.println("Welcome to BlueChat!!");
            return true;
        }
        
        public boolean loginUser(String Username, String password){
            return users.containsKey(username) && users.get(username).equals(hashPassword(password));
        }
}


