/* MyTimeStore.java */

package at.itkollegimst.pos1.timeserviceclient;

import java.io.Serializable;


public class MyTimeStore
implements TimeStore, Serializable
{
  String time;

  @Override
  public void setTime(String time)
  {
    this.time = time;
  }

  @Override
  public String getTime()
  {
    return this.time;
  }
}