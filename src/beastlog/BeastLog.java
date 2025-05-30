/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package beastlog;

/**
 *
 * @author user1
 */
public class BeastLog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Welcome welcomeFrame = new Welcome(); // Crée une instance de ton interface
                welcomeFrame.setVisible(true);       // Affiche la fenêtre
            }
        });
   
    }
}