//Dhruv Thakkar

package Lab2;

public class HotelListing extends Listing {
	protected double parkingCharge;
	protected int numConference;
	protected boolean breakfast;
	protected boolean pool;
	protected boolean petsAllowed;
	
	public HotelListing(int id,String name,String des, String rType, String ame, double cpn,
			double pCharge,int numC,boolean bfast,boolean pool,boolean pa) {
		super(id,name,des,rType,ame,cpn);
		this.parkingCharge = pCharge;
		this.numConference = numC;
		this.breakfast = bfast;
		this.pool = pool;
		this.petsAllowed = pa;
	}
	
	public void setParkingCharge(double pCharge) {
		this.parkingCharge = pCharge;
	}
	
	public double getParkingCharge() {
		return this.parkingCharge;
	}
	
	public void setNumConference(int numC) {
		this.numConference = numC;
	}
	
	public int getNumConference() {
		return this.numConference;
	}
	
	public void setBreakfast(boolean bfast) {
		this.breakfast = bfast;
	}
	
	public boolean getBreakfast() {
		return this.breakfast;
	}
	
	public void setPool(boolean pool) {
		this.pool = pool;
	}
	
	public boolean getPool() {
		return this.pool;
	}
	
	public void setPetsAllowed(boolean pa) {
		this.petsAllowed = pa;
	}
	
	public boolean getPetsAllowed() {
		return this.petsAllowed;
	}
}
