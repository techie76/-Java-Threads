public class HanoiExample  {
	

public static void TowerofHanoi (int num, char src, char dst, char temp)
{
	if (num < 1)
		return;
	
	TowerofHanoi (num -1, src,temp,dst);
	System.out.println(" Move " +num+ " disk from peg " +src+ "to peg " + dst);
	TowerofHanoi(num -1,temp,dst,src);
}

public static void main (String [] args)
{
	int num =4;
	System.out.println(" The sequence Of moves are");
	TowerofHanoi(num, 'A', 'C', 'B');
}
}