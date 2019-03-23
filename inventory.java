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


	Node inventory;
	String currentItemClass;
	String[] classArray = new String[]{'helmet', 'chestplate', 'gloves', 'boots'};

	public inventory(){
		inventory = null;
		currentItemClass = "";
	}

	public static void add(String item, String itemClass){
		String[] arr = classArray;
		boolean modifier = false;
		if(itemClass != null && item != null){
			int i = 0;
			if(!(arr[i].equals(itemClass))){
				i++;
				while(!(arr[i].equals(itemClass))){
					i++;
					if(i == 3){
						modifier = false;
						break;
					}

				}
			}
		}
	}

}