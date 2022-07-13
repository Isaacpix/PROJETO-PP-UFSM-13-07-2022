/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula13isaac;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuário
 */
public class fluxo13 extends Thread {
    
    janela_13_Isaac janela = new janela_13_Isaac();
    
    public fluxo13(String nome, int posicao)  {
            janela.setTitle(nome);
            janela.setLocation(posicao,100);
            janela.setVisible(true);
            
}
@Override
    public void run() { 
        int i;
            for (i=0;i<=100;i++)  {
            try { 
               janela.setBarra(i);
                 
            sleep(500);
        }
        catch (InterruptedException ex) {
                System.out.println(ex.toString());
        }
}
    }
}

    

