/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test_1;

import java.util.LinkedList;

/**
 *
 * @author Sithum Ravishara
 */
public class Palindrome {
    
    public static String PalindromeCheck(LinkedList<Integer> listOne, LinkedList<Integer> listTwo){
        
        String status = "";
        int i = 0;
        while(i < listOne.size()){
            if(listOne.get(i) == listTwo.get(i)){
                if(i == listTwo.size()-1){
                 status = "List is Palindrome.";
                }
                i++;
            } else {
                status = "List is not Palindrome.";
            }
            i++;
        }
        return status;
    }
}
