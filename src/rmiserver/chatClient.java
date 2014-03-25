/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rmiserver;

/**
 *
 * @author Dakshitha
 */

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class chatClient {
     public static void main(String args[]){
        try {
            Remote remote = Naming.lookup("rmi://localhost:5050/Chat_Server");
            chatServer server = (chatServer)remote;
            boolean b = server.login("ABC");
            server.sendMessage("awa");
            System.out.println("- "+b);
        } catch (NotBoundException ex) {
            Logger.getLogger(chatClient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(chatClient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(chatClient.class.getName()).log(Level.SEVERE, null, ex);
        }
             
        
     }
             
    
}
