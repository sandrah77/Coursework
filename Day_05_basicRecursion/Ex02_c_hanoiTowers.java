/* 
A legend says that, somewhere in the East, near Hanoi, there is a temple. In the temple, there are three posts. In the posts, there are 64 discs of 64 different sizes. When the world was created, all the discs were in the first post; when all the discs are moved to the last post, the world will end.
The monks in the temple move the discs between posts, but they must obey two simple rules. First, only one disc can be moved at a time, from one post to another post (it cannot be left anywhere else). Last, but not least, a disc can only be placed on top of a bigger disc, never on top of a smaller disc. The smallest disc can be placed on any post (all other discs are bigger); the biggest disc can only be placed on an empty post.

Create a method that calculates the number of moves necessary to move a set of n Hanoi disks from the initial post to the last post. 

Hint: if you want to play monk yourself in order to better understand the problem, ask the lecturer for a “Hanoi envelope”.
*/


public class Ex02_c_hanoiTowers{
	public static void main (String[] args) {

	// Create a new object of the class
	Ex02_c_hanoiTowers t = new Ex02_c_hanoiTowers();
	// Enter the number of discs, 63 is the maximum amount you can enter.
	System.out.println(t.towerMoves(63));
	
	}
	// Recursively call the method.
	public long towerMoves(long n){
		long move;
		if (n <= 1) { 
			return 1;
		} else {
		move = 2 * (towerMoves(n - 1)) + 1; 
				return move;
		}
	}
}