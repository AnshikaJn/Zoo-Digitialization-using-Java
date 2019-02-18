package rmi.app;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface LoginInter  extends Remote
{
    public boolean check(String id,String pass)throws RemoteException;
}
