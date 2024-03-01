/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphisme.uas;

/**
 *
 * @author ACER
 */
public class PolymorphismeUas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kendaraan kdrn  =new Kendaraan();
        
      Keretaapi krtpi=new Keretaapi();
      Mobil Mbl=new Mobil();
      MotorNinja Nja =new MotorNinja( );
      MotorRxking Mtrx=new MotorRxking();
      Sepeda Spd=new Sepeda();
      krtpi.tampilSuara();
        Mbl.tampilSuara();
        Nja.tampilSuara();
         Mtrx.tampilSuara();
        Spd.tampilSuara();
        

    }
    
}

    