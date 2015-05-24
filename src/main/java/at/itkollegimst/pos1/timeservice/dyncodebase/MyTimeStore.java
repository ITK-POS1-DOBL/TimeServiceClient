/* MyTimeStore.java */

package at.itkollegimst.pos1.timeservice.dyncodebase;

import at.itkollegimst.pos1.timeservice.interfaces.TimeStore;
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