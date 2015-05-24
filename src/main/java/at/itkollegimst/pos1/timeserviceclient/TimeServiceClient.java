/* TimeServiceClient.java */

package at.itkollegimst.pos1.timeserviceclient;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class TimeServiceClient
{
  public static void main(String[] args)
  {
    try {
      String host = "localhost"; // original: "ph01" = machine 1 -> localhost for simplicity
      String port = "1099"; // standard RMI registry port
      String srv  = "TimeService"; // service name as registered by server in RMI registry
      String url = "rmi://" + host + ":" + port + "/" + srv;  // RMI registry URL
      System.out.println("Looking-up TimeService " + url);
      TimeService ts = (TimeService)Naming.lookup(url); 
      System.out.println("  Server time is " + ts.getTime()); 
      System.out.print("  MyTimeStore contains ");
      TimeStore tsd = new MyTimeStore(); 
      tsd = ts.storeTime(tsd); 
      System.out.println(tsd.getTime());
    } catch (NotBoundException | MalformedURLException | RemoteException e) {
      System.err.println(e.toString());
      System.exit(1);
    }

  }
}