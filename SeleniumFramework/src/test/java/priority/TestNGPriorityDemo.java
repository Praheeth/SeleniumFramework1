package priority;

import org.testng.annotations.Test;

public class TestNGPriorityDemo 
{
  @Test(priority = 1)
	public void one()
  {
	  System.out.println("Inside Test1");
  }
  @Test(priority = 1)
  public void two()
  {
	  System.out.println("Inside Test2");
  }
  @Test
  public void three()
  {
	  System.out.println("Inside Test3");
  }
}
