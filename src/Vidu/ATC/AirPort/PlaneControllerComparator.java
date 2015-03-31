/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Vidu.ATC.AirPort;

import Vidu.ATC.Flights.PlaneController;
import java.util.Comparator;

/**
 *
 * @author Viduruvan Suvinith Godawaththa <viduruvans at gmail.com> @ viduruvan.net
 *
 * This code is licensed under a Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Unported License.
 */
public class PlaneControllerComparator implements Comparator<PlaneController> {

    public int compare(PlaneController o1, PlaneController o2) {
       // throw new UnsupportedOperationException("Not supported yet.");
             // Assume neither string is null. Real code should
        // probably be more robust
        try{
            if (o1.getPiorityValue() > o2.getPiorityValue() )
            {
                return -1;
            }
            else if (o1.getPiorityValue()  < o2.getPiorityValue() )
            {
                return 1;
            }
        }
        catch(UnsupportedOperationException ex)
        {

        }
       
        return 0;
    }



}
