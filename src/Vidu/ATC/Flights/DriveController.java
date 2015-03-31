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
public abstract class  DriveController {


    public abstract void drive();
    public abstract void SetRunWay(float Distance);
    public abstract PlanePiority getPlanePiority();
}
