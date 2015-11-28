public class TestScript
{
	public static void main(String agrs[])
	{
		IntegerTreeNode treeRoot = new IntegerTreeNode(10);
		treeRoot.add(6);
		treeRoot.add(61);
		treeRoot.add(16);
		if(treeRoot.contains(61))
		{
			System.out.println("Yes " + 61 + "e xist");
		}
		else
		{
			System.out.println("No " + 61 + " does not exist");
		}
	}
}