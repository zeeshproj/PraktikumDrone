/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dronegame;

/**
 *
 * @author asus
 */
public class DroneGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Drone drone = new Drone();
        
        drone.energi = 11;
        drone.terbang();
        
        drone.energi = 11;
        drone.matikanMesin();;
        
        drone.ketinggian = 11;
        drone.energi = 11;
        drone.turun();
        
        drone.energi = 11;
        drone.belok();
        
        drone.energi = 4;
        drone.maju();
        drone.kecepatan = 2;
        
        drone.energi = 4;
        drone.mundur();
        drone.kecepatan = 11;
        
        
        
        
    }
    
}
