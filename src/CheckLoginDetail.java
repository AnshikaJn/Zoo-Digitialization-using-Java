package rmi.app;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CheckLoginDetail   extends UnicastRemoteObject  implements  LoginInter
{
public CheckLoginDetail()throws RemoteException{}    

    @Override
    public boolean check(String id, String pass) throws RemoteException 
    {
         if(id.equals("abc") && pass.equals("abc123"))    
             return  true;
         else
             return false;
    }
    
    
}
