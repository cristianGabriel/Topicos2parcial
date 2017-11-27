package arrieta.com;

public class Frame {
	
	public boolean valido(int i, int j) {
		int frame = i +j;
		
		if (frame >=0 && frame <=10) {
			return true;
		}
		
		return false;
		
	}

}
