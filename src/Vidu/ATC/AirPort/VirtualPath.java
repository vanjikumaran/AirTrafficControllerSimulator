/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Vidu.ATC.AirPort;

import Vidu.ATC.Flights.PlaneController;

/**
 *
 * @author Viduruvan Suvinith Godawaththa <viduruvans at gmail.com> @ viduruvan.net
 *
 * This code is licensed under a Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Unported License.
 */

// This should act as a queue
public class VirtualPath {

    final static int SIZE =5;

    private PlaneController[] queue;

    private boolean empty;
     private boolean full;

   private int front = 0;  // front pointer
   
   private int rear = 0;  // rear pointer

   private int top = 0;  // size of queue

    public VirtualPath()
    {
        queue=new PlaneController[SIZE];
        front = 0;
        rear = 0;
        top = 0;
    }

    public boolean isEmpty() {

        if( top == 0)
        {
            empty = true;
        }
        else
        {
            empty = false;
        }
        return empty;
    }

    public void insert(PlaneController c) {
      if (!IsFull()) {
         top++;
         rear = (rear + 1)%SIZE;
          queue[rear] = c;
      }
      else
         System.err.println("Overflow\n");
   }

    public PlaneController delete() {
      if (!isEmpty()) {
         top--;
         front = (front + 1)%SIZE;
         return queue[front];
      }
      else {
         System.err.println("Underflow");
         return null;
      }
   }

    public boolean IsFull() {
        if(top==SIZE)
        {
            full=true;
        }
        else
        {
            full=false;
        }
      return full;
   }

    public void sort()
    {
       

      boolean swapped = true;

      int j = 0;

      PlaneController tmp;

      while (swapped) {

            swapped = false;

            j++;

            for (int i = 0; i < queue.length - j; i++) {
                  if ((queue[i].getPiorityValue()) > (queue[i + 1].getPiorityValue())) {
                        tmp = queue[i];

                        queue[i] = queue[i + 1];

                        queue[i + 1] = tmp;

                        swapped = true;

                  }

            }

    }

  }

    public void reverse()
    {

        PlaneController[] tempQueue;

        for(int i=0;i<SIZE;i++)
        {
            
        }
    }

}
