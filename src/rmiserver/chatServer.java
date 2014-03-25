/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rmiserver;

/**
 *
 * @author Dakshitha
 */
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;



public interface chatServer extends Remote{
    public boolean login(String userName)  throws RemoteException;
    public boolean sendMessage (String message) throws RemoteException;
    public List<String> getAllMessages() throws RemoteException;
}
