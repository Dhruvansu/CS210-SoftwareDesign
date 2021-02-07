//Dhruv Thakkar

package Lab2;

public class Listing {
	protected int id;
	protected String name;
	protected String description;
	protected String roomType;
	protected String amenities;
	protected double costpNight;
	
	public Listing(int id, String name, String des, String roomType, String ame, 
			double costpNight) {
		this.id = id;
		this.name = name;
		this.description = des;
		this.roomType = roomType;
		this.amenities = ame;
		this.costpNight = costpNight;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setDescription(String des) {
		this.description = des;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	
	public String getRoomType() {
		return this.roomType;
	}
	
	public void setAmenities(String ame) {
		this.amenities = ame;
	}
	
	public String getAmenities() {
		return this.amenities;
	}
	
	public void setCostpNight(int cpn) {
		this.costpNight = cpn;
	}
	
	public double getCostpNight() {
		return this.costpNight;
	}
	
}
