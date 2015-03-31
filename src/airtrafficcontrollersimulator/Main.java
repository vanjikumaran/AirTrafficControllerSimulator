/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package airtrafficcontrollersimulator;

import Vidu.ATC.Flights.DriveController;
import Vidu.ATC.Flights.LandingController;
import Vidu.ATC.Flights.Mode;
import Vidu.ATC.Flights.Plane;
import Vidu.ATC.Flights.PlaneController;
import Vidu.ATC.Flights.PlanePiority;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Viduruvan Suvinith Godawaththa <viduruvans at gmail.com> @ viduruvan.net
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

         Plane plane = new Plane();
         plane.setPlanePiorty(PlanePiority.NORMAL);

         DriveController flightController = new  LandingController(plane);

        PlaneController planeCont = new PlaneController(flightController );

          Plane plane2 = new Plane();

         DriveController flightController2 = new  LandingController(plane2);

        PlaneController planeCont2 = new PlaneController(flightController2 );


        try {
            planeCont.connectToAtc();
        } catch (Exception ex) {
            Logger.getLogger(PlaneController.class.getName()).log(Level.SEVERE, null, ex);
        }

         try {
            planeCont2.connectToAtc();
        } catch (Exception ex) {
            Logger.getLogger(PlaneController.class.getName()).log(Level.SEVERE, null, ex);
        }


        

    }

}
