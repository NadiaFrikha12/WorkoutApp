/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author user1
 */
public class Muscle {
    public int id_m ;
    public String muscle_cible;
    public String nom_exercice;
   
    public Muscle(){
        this.id_m = 0;
        this.muscle_cible ="";
        this.nom_exercice="";
    }
    
    public Muscle(int id, String muscle, String exercise){
        this.id_m = id;
        this.muscle_cible= muscle;
        this.nom_exercice=exercise;
    }
    
    
}
