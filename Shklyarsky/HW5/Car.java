public class Car {

	private String type;
	private int YearProduction;
	private int engine;
	
	public Car() {
		
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getYearProduction() {
		return YearProduction;
	}

	public void setYearProduction(int yearProduction) {
		YearProduction = yearProduction;
	}

	public int getEngine() {
		return engine;
	}

	public void setEngine(int engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [type=" + type + ", YearProduction=" + YearProduction + ", engine=" + engine + "]";
	}
	
	
}
