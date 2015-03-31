/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Vidu.ATC.Flights;

/**
 *
 *
 * This calss held attribute od plane.This class acts as record class and this does not include any alogrithms
 * or heavy implmentations.
 *
 * @author Viduruvan Suvinith Godawaththa <viduruvans at gmail.com> 
 * @version 1.0
 * The contents of this file are subject to the terms of the Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Unported License
 * You can obtain a copy of the
 * License at http://viduruvan.net/eng/rights/
 */
public class Plane {

    /**The Name of the plane to identify purpose*/
    private String name;
    /**The speed of the plan to calculate fuel consumption*/
    private float speed;
// private float velocityX;
   // private float velocityY;
    /**Acceleration of plane v*u+at*/
    private double acceleration;
    /**Avalable ffuel of plane*/
    private double fuel;
      /**Plane mode LANDING,NUTRAL,TAKEOFF*/
    private Mode planeMode;
      /**Plane Piority  NORMAL,MEDICAL,FUELSHORTAGE,MICANICAL,OTHER*/
    private PlanePiority planePiorty;
    /**Current Location of the plane x cordinates*/
    private int locationX;
     /**Current Location of the plane y cordinates*/
    private int locationY;
   // private int locationH;
  //  private int destinationX;
  //  private int destinationY;
     /**State of the plane attached to atc or released form ATC*/
    private State state;

    public Plane() {
        this.speed = 632;
        this.fuel = 1000;
        this.distancetoAtc = 4000;
    }


   
    private float distancetoAtc;
    /**
     * Returns double object containing acceleration values
     * @return acceleration as double containing acceleration value
     */
    public double getAcceleration() {
        return acceleration;
    }
    /**
     * Set the acceleration value of the plane
     * @param acceleration as double
     */
    public void setAcceleration(double acceleration) {
        this.acceleration = acceleration;
    }
    /**
     * Returns double object containing fuel values
     * @return fuel as double containing fuelvalue
     */
    public double getFuel() {
        return fuel;
    }
    /**
     * Set the Fuel value of the plane
     * @param fuel as double
     */
    public void setFuel(double fuel) {
        this.fuel = fuel;
    }
    /**
     * Returns int  containing x cordinates related to default location of frame
     * @return x cordinates  as int containing location
     */
    public int getLocationX() {
        return locationX;
    }
    /**
     * Set x cordignton of  of the plane
     * @param locationX as int
     */
    public void setLocationX(int locationX) {
        this.locationX = locationX;
    }
    /**
     * Returns int  containing y cordinates related to default location of frame
     * @return y cordinates  as double containing location
     */
    public int getLocationY() {
        return locationY;
    }
        /**
     * Set y cordignton of  of the plane
     * @param locationY as int
     */
    public void setLocationY(int locationY) {
        this.locationY = locationY;
    }
    /**
     * Returns identity value of the plane
     * @return unique identity value assigned to object
     */
    public String getName() {
        return name;
    }
    /**
     * Set the name of the plane
     * @param name as a String
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Returns Mode of the plane LANDING/NUTRAL/TAKEOFF
     * @return Mode of the plane as Mode type
     * @see Vidu.ATC.Flights.Mode
     */
    public Mode getPlaneMode() {
        return planeMode;
    }
    /**
     * Set the planeMode of the plane as Mode of the plane LANDING/NUTRAL/TAKEOFF
     * @param planeMode as @see Vidu.ATC.Flights.Mode
     */
    public void setPlaneMode(Mode planeMode) {
        this.planeMode = planeMode;
    }
     /**
     * Returns piority of the plane NORMAL/MEDICAL/FUELSHORTAGE/MICANICAL/OTHER
     * @return piority of the plane as  PlanePiority type
     * @see Vidu.ATC.Flights.PlanePiority
     */
    public PlanePiority getPlanePiorty() {
        return planePiorty;
    }
    /**
     * Set the planePiority as piority of the plane NORMAL/MEDICAL/FUELSHORTAGE/MICANICAL/OTHER
     * @param planePiorty as @see Vidu.ATC.Flights.PlanePiority
     * @see Vidu.ATC.Flights.PlanePiority
     */
    public void setPlanePiorty(PlanePiority planePiorty) {
        this.planePiorty = planePiorty;
    }
    /**
     * Returns speed of the plane
     * @return speed of the plane as  float
     */
    public float getSpeed() {
        return speed;
    }
    /**
     * Set the speed of the plane
     * @param speed as float
     */
    public void setSpeed(float speed) {
        this.speed = speed;
    }
    /**
     * Returns state of the plane Attached/Release
     * This indicate weater plane is attached to atc or not
     * @return state of the plane as  State
     * @see Vidu.ATC.Flights.State
     */
    public State getState() {
        return state;
    }
    /**
     * Set the state of the plane
     * This set plane is attached or release
     * @param state as State
     * @see Vidu.ATC.Flights.State
     */
    public void setState(State state) {
        this.state = state;
    }

     /**
     * Returns distance to ATC that perticular plane has
     * @return distancetoAtc as  float
     */
    public float getDistancetoAtc() {
        return distancetoAtc;
    }

     /**
     * Set the distance that plane has to ATC
     * @param distancetoAtc as float
     */
    public void setDistancetoAtc(float distancetoAtc) {
        this.distancetoAtc = distancetoAtc;
    }


}
