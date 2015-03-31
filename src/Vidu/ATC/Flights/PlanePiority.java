/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Vidu.ATC.Flights;

/**
 *
 * @author Viduruvan Suvinith Godawaththa <viduruvans at gmail.com>
 * @version 1.0
 * The contents of this file are subject to the terms of the Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Unported License
 * You can obtain a copy of the
 * License at http://viduruvan.net/eng/rights/
 */

/**
 * Enum mode for set the plane Piority.NORMAL,MEDICAL,FUELSHORTAGE,MICANICAL and OTHER.
 *
 *
 * @author Viduruvan Suvinith Godawaththa <viduruvans at gmail.com> @ viduruvan.net
 */
public enum PlanePiority {
    /**
     *Plane is in normal situation and it does not have any special need
     */
 NORMAL,
 /**
  * Plane is in Medical emergency and it requres some piority.
  */
 MEDICAL,
  /**
  * Plane out of fuel and it is in fueelshortage emergency and it requres some piority.
  */
 FUELSHORTAGE,
 /**
  * Plane out   is in micanical emergency and it requres some piority.
  */
 MICANICAL,
  /**
  * plane is in some kind of emergench it is requre more piority than normal piority.
  */
 OTHER;

}
