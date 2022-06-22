/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.test_1;

import java.util.LinkedList;

/**
 *
 * @author Sithum Ravishara
 */
public class Test_1 {

    public static void main(String[] args) {
        
        LinkedList<Integer> listOne = new LinkedList<>();
        LinkedList<Integer> listTwo = new LinkedList<>();
        
        //assign values
        listOne.add(3);
        listOne.add(3);
        listOne.add(3);
        
        System.out.println("This is Original LinkedList:"+ listOne);
        
        int numberOne = listOne.get(1);
        System.out.println("Number here:"+ numberOne);
        
        // Reversed LinkedList
        listTwo = Reverse.reverseMethod(listOne);
        System.out.println("Reversed Linkedlist: "+ listTwo);
        
        //Palindrome check
        String value = Palindrome.PalindromeCheck(listOne, listTwo);
        System.out.println(value);
    }
}

