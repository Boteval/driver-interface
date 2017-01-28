package org.botest.driver;
/**
 * 
 * Description of the system being driven by the driver
 *   
 */

public class TargetSystem extends ExpectedTargetSystem {
 
  /**
   * time that the system driven by the driver last started.
   * target system should keep the time it started to supply whenever asked for it. 
   */
  public java.util.Date started;
  
}