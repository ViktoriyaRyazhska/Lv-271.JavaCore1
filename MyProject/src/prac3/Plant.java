package prac3;

public class Plant {
	private int size;
	private Color color;
	private Type type;

	@Override
	public String toString() {
		return "Plant [size=" + size + ", color=" + color + ", type=" + type + "]";
	}

	public Plant(String type, String color, int size) throws ColorExceptions, TypeExceptions {
		Color c = colorStrToEnum(color);
		
		this.size = size;
		Type t = null;
		this.type = t ;
		this.color = c;
	}

	private Color colorStrToEnum(String color) throws ColorExceptions {
		switch (color.toLowerCase()) {
		case "blue":
			return Color.BLUE;
		case "red":
			return Color.RED;
		case "white":
			return Color.WHITE;
		default:
			throw new ColorExceptions("Input only color blue, red or white");
		}
	}

	

}
