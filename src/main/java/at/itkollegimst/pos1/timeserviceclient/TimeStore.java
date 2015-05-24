package at.itkollegimst.pos1.timeserviceclient;

import java.io.Serializable;

public interface TimeStore
extends Serializable
{
  public void setTime(String time);

  public String getTime();
}