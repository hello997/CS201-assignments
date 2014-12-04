
public class PriorityQueue {
	TreeNode[] myArray;
	
	//initializing queue with specified size, most likely from
	public PriorityQueue(int size){
		myArray = new TreeNode[size];
	}
	
	public void insert(TreeNode n){
		if (myArray.length==0){
			myArray[0]=n;
		}
		else{
			int index = 0;
			while (n.myWeight>myArray[index].myWeight){
				index++;
			}
			TreeNode insert = n;
			TreeNode temp;
			while (myArray[index]!=null){
				temp = myArray[index];
				myArray[index]=insert;
				insert = temp;
			}
		}
	}
	
	public TreeNode deleteMin(){
		TreeNode min = myArray[0];
		
		//Shifting elements of a tree after deleting first
		int i=1;
		while (myArray[i]!=null && i<myArray.length){
			myArray[i-1]=myArray[i];
			i++;
		}
		myArray[i-1]=null;
		
		return min;
	}
	
}
