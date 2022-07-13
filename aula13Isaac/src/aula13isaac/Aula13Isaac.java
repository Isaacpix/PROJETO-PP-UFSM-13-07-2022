/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula13isaac;

/**
 *
 * @author Usuário
 */
public class Aula13Isaac extends javax.swing.JFrame {
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        fluxo13 fluxo1, fluxo2, fluxo3, fluxo4;
        
        fluxo1 = new fluxo13("Janela 1", 100);
        fluxo2 = new fluxo13("Janela 2", 200);
        fluxo3 = new fluxo13("Janela 3", 300);
        fluxo4 = new fluxo13("Janela 4", 400);
        
        fluxo1.start();
        fluxo2.start();
        fluxo3.start();
        fluxo4.start();
            
    }
    
}
