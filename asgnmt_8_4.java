
public class asgnmt_8_4 extends Thread{

	/**
	 * @param args
	 * 
	 * 
	 */
	
	 public void run()
	 {
		
		 for(int i=0;i<10;i++)
		 {
			 System.out.println("Printing the count " +i);
			 try{Thread.sleep(1);}catch(Exception e){e.printStackTrace();}
			 
			 
		 }
		 System.out.println("My thread run is over");
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		asgnmt_8_4 t1 = new asgnmt_8_4();
		t1.setName("My Extending Thread");
		System.out.println("My thread created"+ t1);
		t1.start();
		while(t1.isAlive())
		{
			System.out.println("The Main thread will be alive as long as the child thread is live");
			try {
				Thread.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Main thread is over");
		
		

	}

}
