/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


package Vidu.ATC.AirPort;
import Vidu.ATC.CommandCenter.ATCMainPanel;
import Vidu.ATC.Flights.PlaneController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Comparator;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.Insets;
/**
 *
 * @author Viduruvan Suvinith Godawaththa <viduruvans at gmail.com> @ viduruvan.net
 *
 * This code is licensed under a Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Unported License.
 */
public class AirTrafficController extends JFrame implements ActionListener {

        private static AirTrafficController instance=null;
        Comparator<PlaneController> comparator = new PlaneControllerComparator();
        private VirtualPathX queue =new VirtualPathX (10, comparator);

        JButton jbtnLoad;

        ATCMainPanel window = new ATCMainPanel();


        private  AirTrafficController()
        {
            this.init();
        }

        private void  init()
        {

                this.setBounds(0,0,1024,768);
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                jbtnLoad = new JButton("SEND");
		Dimension size = new Dimension();
		Insets insets = this.getInsets();
		size = jbtnLoad.getPreferredSize();
		jbtnLoad.setBounds(125 + insets.left, 140 + insets.top,size.width, size.height);
		this.add(jbtnLoad);
                this.setVisible(true);
	    this.setResizable(false);
           // window.show();
        }

        public void update()
        {
        jbtnLoad.setText("Viduruvan");
        }

        public static AirTrafficController getInstance() throws Exception {
            if(instance == null) {
                instance = new AirTrafficController();
		 System.out.println("This is new server instance created");
              }
	  else if(instance !=null){
            System.out.println("This is old instance");
             }
	  return instance;
	}
        public void connect(PlaneController planeContrller)
        {
             System.out.println("Connected to the ATC");
             //planeContrller.run();
            
            
            queue.add( planeContrller);
            System.out.println("Added");

            System.out.println("Size of the Queue : "+queue.size());
           // planeContrller=queue.remove();
          //  System.out.println(planeContrller.getPiorityValue());
          //  planeContrller.setName("tread1");
         //   planeContrller.start();

            System.out.println("Disconnected from the ATC");
            update();
        }

        public void assignRunWay(PlaneController planeContrller)
        {
            
        }


     public static void main(String[] args)
       {
                        AirTrafficController x = new AirTrafficController();                 
       }

    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

