class ThreadInfo{
	public static void main (String args []){
		Thread t = Thread.currentThread();
		
		System.out.println(" Current thread: " + t);
		System.out.println(" Name " + t.getName());
		System.out.println(" ID " + t.getId());
		System.out.println("Priority " + t.getPriority());
		System.out.println("State " + t.getState());
		
		System.out.println("Changing name and priority");
		t.setName("Primary");
		t.setPriority(8);
		
		System.out.println(" After name and priorty change");
		System.out.println("Current Thread" + t);
		System.out.println("Name: " + t.getName());
		System.out.println("Priority:  " + t.getPriority());
		
	}
}