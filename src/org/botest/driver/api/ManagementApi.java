package org.botest.driver.api;

public interface ManagementApi {

  public void resetUserProfile(String userId);
  
  public void resetAllUserProfiles();
  
  public void resetLearnings();
  
  /**
   *   An implementation may use virtualization api such as VMware/Kubernetes/docker/etc to reset the system under test between runs, as long as such resets are deemed sufficiently speedy.
   */
  public void resetSystem();
}
