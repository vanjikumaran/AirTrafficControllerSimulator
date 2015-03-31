/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Vidu.ATC.Flights;

/**
 *
 * @author Viduruvan Suvinith Godawaththa <viduruvans at gmail.com> @ viduruvan.net
 *
 * This code is licensed under a Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Unported License.
 */
public class LandingController extends  DriveController {

    private Plane plane;
    private double fuelEffency;

    
    public LandingController(Plane plane)
    {
        /*Fuel should be reduce*/
        /*Emegency cgsould be take care*/
        this.plane=plane;
        this.fuelEffency = 10;
    }

    public void SetRunWay(float Distance)
    {
        plane.setDistancetoAtc(Distance);
    }

    public double controlFuel(double fuel)
    {

        return fuel-fuelEffency;
    }

    public float controlSpeed(float speed,float a)
    {
        /**V=u+at
         * V=u+a
         */
        speed= speed+a;
        return speed;

    }

    /**Retrun distance to ATC center*/
    public float controlDistance(float distance,float intialSpeed,float a)
    {
           /*s=ut+1/2at*/
        /**This is in given velocity*/
        distance=distance+(intialSpeed+(a/2));
        return  distance;
    }

      public float controlDistance(float distance,float distanceReductionValue)
    {
           /*s=ut+1/2at*/
        /**This is in given velocity*/
        distance=distance+distanceReductionValue;
        return  distance;
    }

    public void drive()
    {
        double fuel = 0;
        float speed = 0;
        float distanceToAtc = 0;
        float acceleration=-50;

      // while(plane.getDistancetoAtc()>0){
        while(plane.getDistancetoAtc()>0){

       distanceToAtc = plane.getDistancetoAtc();
       distanceToAtc=controlDistance(distanceToAtc,-5);
       plane.setDistancetoAtc(distanceToAtc);


        System.out.println("Landeding");
        System.out.println("Distance :" + distanceToAtc);
      /*  System.out.println("Landed");
        System.out.println("Fuel :" + fuel);
        System.out.println("Speed :" + speed);
        System.out.println("Distance :" + distanceToAtc);

       fuel=plane.getFuel();
       fuel=controlFuel(fuel);
       plane.setFuel(fuel);
        
       speed= plane.getSpeed();
       speed= controlSpeed(speed,(acceleration));
       plane.setSpeed(speed);

       distanceToAtc = plane.getDistancetoAtc();
       distanceToAtc=controlDistance(distanceToAtc,speed,(acceleration));
       plane.setDistancetoAtc(distanceToAtc);

       //acceleration=acceleration+5;
       if (speed==0||distanceToAtc==0)
       {
        System.out.println("Summery");
        System.out.println("Fuel :" + fuel);
        System.out.println("Speed :" + speed);
        System.out.println("Distance :" + distanceToAtc);

        break;
       }

        System.out.println("Landed");
        System.out.println("Fuel :" + fuel);
        System.out.println("Speed :" + speed);
        System.out.println("Distance :" + distanceToAtc);
         */
        }

        System.out.println("Landed");
        System.out.println("Distance :" + distanceToAtc);
    }


     public PlanePiority getPlanePiority()
     {
         return plane.getPlanePiorty();
     }

}
