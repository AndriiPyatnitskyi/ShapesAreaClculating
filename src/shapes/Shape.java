package shapes;

public abstract class Shape {
	protected int[] sidesArray;
	//set resultArea = 1 needs to correct area calculating
	private int resultArea = 1;
	protected String name;
	
	public int CalculateArea() {
		for(int i  = 0; i < sidesArray.length; i++){
			resultArea = resultArea * sidesArray[i]; 
		}
		return resultArea;
	}
	
	public String getName() {
		return name;
	}

	public int[] getSidesArray() {
		return sidesArray;
	}
	
	public void fillArrayElement(int side, int index) {
		sidesArray[index] = side;
	}
}
