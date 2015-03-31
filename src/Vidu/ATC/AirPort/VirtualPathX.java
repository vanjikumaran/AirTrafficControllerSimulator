/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Vidu.ATC.AirPort;
import Vidu.ATC.Flights.PlaneController;
import java.util.Comparator;
import java.util.PriorityQueue;
/**
 *
 * @author Viduruvan Suvinith Godawaththa <viduruvans at gmail.com> @ viduruvan.net
 *
 * This code is licensed under a Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Unported License.
 */
public class VirtualPathX {

    PriorityQueue<PlaneController> queue;
    public  VirtualPathX(int size,Comparator comparator)
    {
          this.queue =
            new PriorityQueue<PlaneController>(10, comparator);
        //super(size,comparator);
    }

    public boolean add(PlaneController planeController)
    {

        return   queue.add(planeController);
    }

    public PlaneController remove()
    {
         return  this.queue.remove();
    }
    
    public PlaneController top()
    {
        return this.queue.peek();
    }

    public int size()
    {
        return this.queue.size();
    }

}
