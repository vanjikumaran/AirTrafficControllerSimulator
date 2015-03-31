/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



package Vidu.ATC.Communication;

/**
 *
 * @author Viduruvan Suvinith Godawaththa <viduruvans at gmail.com> @ viduruvan.net
 *
 * This code is licensed under a Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Unported License.
 */

import java.io.*;
import java.net.*;

public class Client {

private String sentence,modifiedSentence;

		private DataOutputStream outToServer;
		private BufferedReader inFromServer;
		private Socket clientSocket;
		private BufferedReader inFromUser;

		public Client() throws Exception{

		inFromUser =  new BufferedReader(new InputStreamReader(System.in));
                clientSocket = new Socket("192.168.1.2", 6789);

                outToServer = new DataOutputStream(clientSocket.getOutputStream());
                inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

		}

		public String getSentence()
		{
		return sentence;
		}

		public void setSentence(String str)
		{
			this.sentence=str;
		}



		public String getModifiedSentence()
		{
			return modifiedSentence;
		}

		public void setModifiedSentence(String str )
		{
			this.modifiedSentence=str;
		}

		public void connecct() throws Exception{

		//System.out.println("Enter a String");
		//sentence = inFromUser.readLine();

                    outToServer.writeBytes(sentence + '\n');

                    modifiedSentence = inFromServer.readLine();
                    System.out.println("FROM SERVER: " + modifiedSentence);
                    clientSocket.close();

		}

}
