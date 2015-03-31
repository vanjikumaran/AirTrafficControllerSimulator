/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Vidu.ATC.Flights;

/**
 *
 * @author Viduruvan Suvinith Godawaththa <viduruvans at gmail.com>  viduruvan.net
 *
 * This code is licensed under a Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Unported License.
 *
 * @version 1.00
 */


/**
 * Enum Mode for setting the plane mode. LANDING, NUTRAL and TakeOFF.
 * Sets special attributes of the plan class.
 *
 *
 * @author Viduruvan Suvinith Godawaththa <viduruvans at gmail.com> @ viduruvan.net
 */
public enum Mode {

    /**Landing is the mode where we set setting to Land the air plane*/
    LANDING,
    /**NUTRAL mean plane is neither LANDING nor TAKEOFF*/
    NUTRAL,
    /**TAKEOFF mean plane is takeoff*/
    TAKEOFF;

}
