public class inventory{

	private class Node{
		String item;
		String itemClass;
		Node next;
		Node(String item, String itemClass){
			if(a != null && itemClass != null){
				this.item = item;
				this.itemClass = itemClass;
			}
			else{
				throw new NullPointerException("cannot create node with null variables");
			}

		}
	}


	Node helmet;
	Node chestplate;
	Node gloves;
	Node boots;
	String currentItemClass;
	String[] classArray = new String[]{'helmet', 'chestplate', 'gloves', 'boots'};

	public inventory(){
		helmet = null;
		chestplate = null;
		gloves = null;
		boots = null;
		currentItemClass = "";
	}

	public static void add(String item, String itemClass){
		String[] arr = classArray;
		boolean modifier = false;
		if(itemClass != null && item != null){
			if(classChecker(itemClass) != null){
				
			}
			
		}
	}

	//classChecker() checks an itemClass to see if it is part 
	//of the system itemClass ('helmet', 'chestplate', etc...), 
	//if not then it will return null
	private static String classChecker(String itemClass){
		String[] arr = classArray;
		int i = 0;
		if(!(arr[i].equals(itemClass))){
			while(!(arr[i].equals(itemClass))){
				i++;
				if(i == 4){
					return null;
				}
			}
		}
		return arr[i];
	}


}