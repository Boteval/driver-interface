/**
 * Api for a driver to implement
 * 
 * The driver should implement this api in order to make a chat system testable.
 * Some of the required interface methods enable the test system performing chat sessions, while others let the test system reset various states of the chat system. 
 */

public interface Api extends SessionApi, ManagementApi {
  
  public TargetSystem connect(ExpectedTargetSystem expectedTargetSystem); 

  public TargetSystem ping(ExpectedTargetSystem expectedTargetSystem); 
  
}
