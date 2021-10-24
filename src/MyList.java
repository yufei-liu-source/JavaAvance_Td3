
/***
 * 
 * @author liuyufei
 *
 */
public class MyList {
	
	Cell head = null;
	
	int size = 0;
	
	/***
	 * add a cell at the head of the list
	 * @param s
	 */
	public void add(String s) {
		Cell newElement = new Cell(s);
		if(head == null) {
			head = newElement;
		}
		newElement.setNext(head);
		head = newElement;

	}
	
	/***
	 * add a cell at the end of the list
	 * @param s
	 */
	public void addLast(String s) {
		Cell newCell = new Cell(s);
		if (head == null) {
			head = newCell;
		}
		
		Cell tmp = head;
		while (tmp.getNext() != null) {
			tmp = tmp.getNext();
		}
		tmp.setNext(newCell);
	}
	
	/***
	 * add a cell to the index i of the list
	 * @param s
	 * @param i
	 */
	public void addIn(String s, int i) {
		Cell newElement = new Cell(s);
		if (i < 0 || i > size) {
			System.out.println("index out of range!");
		}
		if (i == 0) {
			add(s);		
		}
		Cell cPrevious = getCell(i-1);
		Cell cNext = getCell(i);
		
		cPrevious.setNext(newElement);
		newElement.setNext(cNext);	
	}
	
	
	/***
	 * 
	 * @param index
	 * @return the cell of the index indicated in the parameter
	 */
	public Cell getCell(int index) {
		Cell c = this.head.getNext();
		for (int i = 0; i < index; i++) {
			c = c.getNext();
		}
		return c;
	}
	
	/***
	 * 
	 * @param index
	 * @return the String of the cell of the index indicated in the parameter
	 */
	public String get(int index) {
		if (index < 0 || index > this.size() - 1) {
			return null;
		}
		Cell c = getCell(index);
		return c.getS();
	}
	
	/***
	 * 
	 * @return the size of the list
	 */
	public int size() {
		int size = 0;
		Cell tmp = head;
		while(tmp!=null) {
			size++;
			tmp = tmp.getNext();
		}
		return size;
		
	}
	/*
	@Override
	public String toString() {
		Cell c = this.head;
		
		if(c == null) {
			return("Empty list!");
		}
		
		do {
			System.out.println(c.getS()+ ",");
			c = c.getNext();
		}while (c != null);

		return super.toString();
	}*/

	/***
	 * display the whole list
	 * @param ml
	 */
	public static void displayList(MyList ml) {
		Cell c = ml.head;
		
		if(c == null) {
			System.out.println("Empty list!");
		}
		
		do {
			System.out.println(c.getS());
			c = c.getNext();
		}while (c != null);

	}

	public Cell getHead() {
		return head;
	}

	public void setHead(Cell head) {
		this.head = head;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	public static void main(String[] args) {
		MyList ml = new MyList();
		ml.addLast("tatu");
		ml.add("toto");
		ml.add("titi");
		ml.addLast("tutu");
		
		displayList(ml);

	}
	
	

}
