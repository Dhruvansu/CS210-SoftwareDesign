//Dhruv Thakkar

package Lab2;

public class Host {
	protected int id;
	protected String name;
	protected String date;
	protected String location;
	protected String description;
	protected String responseTime;
	protected String responseRate;
	protected String accepRate;
	protected boolean superHost;
	
	public Host(int id, String name, String date, String location, String description,
			String responseTime, String responseRate, String accepRate, boolean superHost) {
		this.id = id;
		this.name = name;
		this.date = date;
		this.location = location;
		this.description = description;
		this.responseTime = responseTime;
		this.responseRate = responseRate;
		this.accepRate = accepRate;
		this.superHost = superHost;
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
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public String getLocation() {
		return this.location;
	}
	
	public void setDesc(String description) {
		this.description = description;
	}
	
	public String getDesc() {
		return this.description;
	}
	
	public void setRespTime(String responseTime) {
		this.responseTime = responseTime;
	}
	
	public String getRespTime() {
		return this.description;
	}
	
	public void setRespRate(String responseRate) {
		this.responseRate = responseRate;
	}
	
	public String getRespRate() {
		return this.responseRate;
	}
	
	public void setAccepRate(String accepRate) {
		this.accepRate = accepRate;
	}
	
	public String getAccepRate() {
		return this.accepRate;
	}
	
	public void setSuperHost(boolean superHost) {
		this.superHost = superHost;
	}
	
	public boolean getSuperHost() {
		return this.superHost;
	}
}
