/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rmiserver;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dakshitha
 */
public class chatServerImplement extends UnicastRemoteObject implements chatServer{
    
    public chatServerImplement() throws RemoteException{}   
    
    
    private ArrayList<String> chatList = new ArrayList<String>();
 
 
    @Override 
    public boolean login(String userName) throws RemoteException {
        return true; //To change body of generated methods, choose Tools | Templates. 
    }
 
 
    @Override
    public boolean sendMessage(String message) throws RemoteException {
        System.out.println("Message : "+ message );
        chatList.add(message);
        return true;
    }

    @Override
    public List<String> getAllMessages() throws RemoteException {
        return chatList;
    }               
    
}
