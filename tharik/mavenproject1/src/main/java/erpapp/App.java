/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package erpapp;

import erpbl.BusinessLogic;

/**
 *
 * @author hd
 */
public class App {
     public static void main(String[] args) { 
         BusinessLogic bl = new BusinessLogic();
         bl.process(new MySQLUtils());
         
     }
}
