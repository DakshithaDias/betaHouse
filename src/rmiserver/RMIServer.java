/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rmiserver;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dakshitha
 */
public class RMIServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            chatServerImplement server = new chatServerImplement();
            Registry registry = LocateRegistry.createRegistry(5050);
            registry.rebind("Chat_Server",server);
            System.out.println("Server started......");
        
        }catch(RemoteException ex){
            Logger.getLogger(RMIServer.class.getName()).log(Level.SEVERE ,null , ex);
        
        }
    }
}
