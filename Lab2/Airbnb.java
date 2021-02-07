//Dhruv Thakkar

package Lab2;

public class Airbnb extends Listing{
	Host host = new Host(25851263,"Dhruv","02/7/21","Springfield","Upto date with the society", 
			"2 mins", "90%", "75%", true);
	protected String propertyType;
	protected int numOfPeople;
	protected int numBaths;
	protected int numBedrooms;
	protected int minNumNights;
	protected int maxNumNights;
	
	public Airbnb(int id,String name,String des, String rType, String ame, double cpn,
			Host host,String pType,int nop,int nba,int nbe,int minN,int maxN) {
		super(id,name,des,rType,ame,cpn);
		this.host = host;
		this.propertyType = pType;
		this.numOfPeople = nop;
		this.numBaths = nba;
		this.numBedrooms = nbe;
		this.minNumNights = minN;
		this.maxNumNights = maxN;
		
	}
	
	public void setHost(Host host) {
		this.host = host;
	}
	
	public Host getHost() {
		return this.host;
	}
	
	public void setPropertyType(String pType) {
		this.propertyType = pType;
	}
	
	public String getPropertyType() {
		return this.propertyType;
	}
	
	public void setNumOfPeople(int nop) {
		this.numOfPeople = nop;
	}
	
	public int getNumOfPeople() {
		return this.numOfPeople;
	}
	
	public void setNumBaths(int nba) {
		this.numBaths = nba;
	}
	
	public int getNumBaths() {
		return this.numBaths;
	}
	
	public void setNumBedrooms(int nbe) {
		this.numBedrooms = nbe;
	}
	
	public int getNumBedrooms() {
		return this.numBedrooms;
	}
	
	public void setMinNumNights(int minN) {
		this.minNumNights = minN;
	}
	
	public int getMinNumNights() {
		return this.minNumNights;
	}
	
	public void setMaxNumNights(int maxN) {
		this.maxNumNights = maxN;
	}
	
	public int getMaxNumNights() {
		return this.maxNumNights;
	}
	
}
