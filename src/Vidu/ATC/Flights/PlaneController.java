/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Vidu.ATC.Flights;


import Vidu.ATC.AirPort.AirTrafficController;
import Vidu.ATC.AirPort.RunWay;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 *
 * This class is the processing class of plane it is implement runnable interface.This control and keep hevey informations about plane class
 *
 * @author Viduruvan Suvinith Godawaththa <viduruvans at gmail.com>
 * @version 1.0
 * The contents of this file are subject to the terms of the Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Unported License
 * You can obtain a copy of the
 * License at http://viduruvan.net/eng/rights/
 */


public class PlaneController extends Thread {

    /**To keep plane*/
   
    private RunWay track;
    private DriveController flight;
    private int piorityValue=0;

     /**
    * Constructor for pass plane to the controller
    * @param plane as Plane
    * @see Vidu.ATC.Flights.Plane
    */
    public PlaneController(Plane plane) {
       // this.plane = plane;
    }

    public void setRunway()
    {
    flight.SetRunWay(track.getDistance());
    }

    public PlaneController(DriveController flight) {
        this.flight = flight;
    }

    public void planeTakeOff()
    {
        System.out.println("Plane is taking off");
    }


    public void planeLand()
    {
        System.out.println("Plane is Landing");
    }

    public int calculatePiority()
    {

        if(flight.getPlanePiority()==PlanePiority.NORMAL)
        {
            piorityValue=0;
        }
        else if(flight.getPlanePiority()==PlanePiority.FUELSHORTAGE)
        {
            piorityValue=10;
        }
        else if(flight.getPlanePiority()==PlanePiority.MEDICAL)
        {
            piorityValue=5;
        }
         else if(flight.getPlanePiority()==PlanePiority.MICANICAL)
        {
            piorityValue=8;
        }
          else if(flight.getPlanePiority()==PlanePiority.OTHER)
        {
            piorityValue=4;
        }
        return piorityValue;
    }
    public void connectToAtc() throws Exception
    {
        /*Connect To ATc and get runwway distance this tread to it*/

        /*Set Runway distatnce*/
       flight.SetRunWay(3000);
        /*Pass to ATC this*/
       AirTrafficController atc=AirTrafficController.getInstance();
      // System.out.println("Connected To the ATC");
      // System.out.println("flag");
       atc.connect(this);
        
        
    }

    @Override
    public void run()
    {
        try {
            Thread.sleep(3000);
            System.out.println(this.getName());
            this.track = new RunWay();
            track.setOccupied(true);
            flight.drive();
            track.setOccupied(false);
        } catch (InterruptedException ex) {
            Logger.getLogger(PlaneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int getPiorityValue() {
        return piorityValue;
    }

    

    public static void main(String[] args){

        Plane plane = new Plane();
        DriveController flightController = new  LandingController(plane);

        PlaneController planeCont = new PlaneController(flightController );
        System.out.println(2);
        try {
            planeCont.connectToAtc();
        } catch (Exception ex) {
            Logger.getLogger(PlaneController.class.getName()).log(Level.SEVERE, null, ex);
        }
       // planeCont.run();
    }
}
