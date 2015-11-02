

public class IntegerTreeNode {
	private int value;
	private IntegerTreeNode left;
	private IntegerTreeNode right;
	// methods would be here
	
	IntegerTreeNode (int n) {
		this.value = n;
	}
		
	public void add (int newNumber) {
		if (newNumber > this.value) {
			if (right == null) {
				right = new IntegerTreeNode(newNumber);
			} else {
				right.add(newNumber);
			}
		} else {
			if (left == null) {
				left = new IntegerTreeNode(newNumber);
			} else {
				left.add(newNumber);
			}
		}
	}
	
	public boolean contains (int n) {
		if (this == null) {
			return false;
		} else {
		if (n == this.value) {
			return true;
		} else {
				if(n < this.value) {
				//search the left subTree
					if(this.left != null) {
						return this.left.contains(n);
					} else {
						return false;
					}
				} else {
					//search theRight subTree
					if(this.right != null) {
						return this.right.contains(n);
					} else {
						return false;
					}
				}
			}			
		}
	}

	public int getMax(int x) { 
		while (this.value(x) != null) {
			
		}else if{
			(this.value() >

		}


		}
	}

		return max;
	}
		
	public int getMin() {
		
		return min;



