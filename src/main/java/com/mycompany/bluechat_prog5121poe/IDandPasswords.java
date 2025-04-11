/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bluechat_prog5121poe;
import java.util.HashMap;
/**
 *
 * @author st10474559(Ntivo Carl Manyike)
 */
public class IDandPasswords {
    
    HashMap<String,String> logininfo = new HashMap<String,String>();
    
    IDandPasswords(){
        
        logininfo.put("Carl1","Zomb0zo");
        logininfo.put("Musa2","Skomot@");
         
    }
    
    protected HashMap getLoginInfo(){
        return logininfo;
    }
}
