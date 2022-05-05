package Test_NG;

import org.testng.annotations.Test;

public class NewTest1 {
  @Test
  public void test1() throws InterruptedException {
	//  Thread.sleep(2000);\
	  test3();
	  System.out.println("Hii am test 1");
  }
	@Test 
  public void test() throws InterruptedException {
		//  Thread.sleep(2000);
		  System.out.println("Hii am test 2");
		  test3();
	}
	public void test3()
	{
		System.out.println("hii am test 3");
	  
  }
}




