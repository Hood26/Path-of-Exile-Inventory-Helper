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
	String[] classAdd = new String[]{'helmet', 'chestplate', 'gloves', 'boots'};

	public inventory(){
		helmet = null;
		chestplate = null;
		gloves = null;
		boots = null;
		currentItemClass = "";
	}

	//add(): adds a piece of armour to the inventory.
	//checks itemClass to tell what the item is and where to put it.
	public static void add(String item, String itemClass){
		Node inventorySpot; 
		String[] arr = classAdd;
		boolean modifier = false;
		if(itemClass != null && item != null){
			invenotySpot = classChecker(itemClass);
			if(itemClass.equals("helmet")){
				if(inventorySpot == null){
					inventorySpot.next = new Node(item, itemClass);
				}
				else
					while(H.next != null){
						H = H.next;
					}
					H.next = new Node(item, itemClass);
			}
		}
		else
				throw new NullPointerException(" Inventory: Add: ERROR: Can't add a null item variable");
	}

	//classChecker() returns the node the itemClass is.
	//of the system itemClass ('helmet', 'chestplate', etc...), 
	//if not then it will return null.
	private static Node classChecker(String itemClass){
		if(itemClass.equal("helmet")){return helmet };
		else if(itemClass.equals("chestplate")){return chestplate; }
		else if(itemClass.equals("gloves")){return gloves; }
		else if(itemClass.equals("boots")){return boots; }
		else
			return null;
	}
	


}