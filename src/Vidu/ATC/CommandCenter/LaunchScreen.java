/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Vidu.ATC.CommandCenter;

import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.BorderFactory;

/**
 *
 * @author Viduruvan Suvinith Godawaththa <viduruvans at gmail.com> @ viduruvan.net
 *
 * This code is licensed under a Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Unported License.
 */
public class LaunchScreen extends JFrame implements ActionListener{
JButton jbtnLaunchATC;
JButton jbtnLaunchPlaneCreater;
    
     LaunchScreen()
     {
                this.setBounds(0,0,300,400);
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


                 jbtnLaunchATC = new JButton("Launch ATC");
		Dimension size = new Dimension();
		Insets insets = this.getInsets();
		size =  jbtnLaunchATC.getPreferredSize();
		 jbtnLaunchATC.setBounds(100 + insets.left, 140 + insets.top,size.width, size.height);
		this.add(jbtnLaunchATC);
                jbtnLaunchATC.addActionListener(this);
                
                jbtnLaunchPlaneCreater = new JButton("Launch Plane Creater");

		size =  jbtnLaunchPlaneCreater.getPreferredSize();
		 jbtnLaunchPlaneCreater.setBounds(76 + insets.left, 200 + insets.top,size.width, size.height);
		this.add(jbtnLaunchPlaneCreater);
                jbtnLaunchPlaneCreater.addActionListener(this);
                this.setVisible(true);
	    this.setResizable(false);
     }

    public void actionPerformed(ActionEvent e) {
      if (e.getSource()==jbtnLaunchATC){
            System.out.println("Passed by here");

      }
      if (e.getSource()==jbtnLaunchPlaneCreater){
          PlaneSetter planeSetter = new PlaneSetter();
          planeSetter.show();
            System.out.println("Passed by Plane Creater");
      }
    }

    public static void main(String[] args)throws Exception{
			 LaunchScreen launch = new LaunchScreen();
		}
    
   
}
