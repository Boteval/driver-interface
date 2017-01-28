package org.botest.driver.api;

public interface SessionApi {
  public void openUserSession(String userId);
  public void sendUserMessage(String text);
}
