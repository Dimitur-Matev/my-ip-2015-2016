public class Room {
	// define fields
	private int width;
	private int height;
	
	// in Eclipse: Alt+Shift+S R to generate getters/setters
	// or right click > source > generate getters/setters
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		if(width>0)
			this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		if(height>0)
			this.height = height;
	}
	
	// CTRL+SPACE  = method
	public int calculateArea() {
		// CTRL+1 = quickfix(return type)
		return height*width;

	}
	
	@Override
	public boolean equals(Object obj){
		if(obj==this)
			return true;
		if(obj instanceof Room){
			final Room room2 = (Room) obj;
			return room2.height==height && room2.width==width;
		}
		return false;
	}
}
