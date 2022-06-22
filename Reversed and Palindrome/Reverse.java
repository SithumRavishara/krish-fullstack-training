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
public class Reverse {
    
    public static LinkedList<Integer> reverseMethod(LinkedList<Integer> numbers){
    
    LinkedList<Integer> b = numbers;
    LinkedList<Integer> c = new LinkedList<>();
   
    
    for(int i = 0; i < b.size(); i++){
        c.add(b.get(b.size()-(i+1)));
    }    
    return c;
    }
}
