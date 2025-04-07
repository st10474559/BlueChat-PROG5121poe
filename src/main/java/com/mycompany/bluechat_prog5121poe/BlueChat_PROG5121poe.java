/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bluechat_prog5121poe;

/*
 * @author st10474559(Ntivo Carl Manyike)
 */
public class BlueChat_PROG5121poe {

    public static void main(String[] args){
       
        IDandPasswords idandPasswords = new IDandPasswords();
        
        LoginPage loginPage = new LoginPage(idandPasswords.getLoginInfo());
    }
 }


