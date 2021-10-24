/***
 * 
 * @author liuyufei
 *
 */
public class Cell {
	
	private String s;
	
	private Cell next;

	public Cell(String s) {
		this.s = s;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	public Cell getNext() {
		return next;
	}

	public void setNext(Cell next) {
		this.next = next;
	}
	
	

}
