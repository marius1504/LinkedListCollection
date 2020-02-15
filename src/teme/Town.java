package teme;

@SuppressWarnings("rawtypes")
public class Town implements Comparable {
	private String town;
	private int distance;
	
	public Town(String town, int distance) {
		this.town = town;
		this.distance = distance;
	}
	
	public String getTown() {
		return this.town;
	}
	
	public void setTown(String town) {
		this.town = town;
	}
	
	public int getDistance() {
		return this.distance;
	}
	
	public void setDistance(int distance) {
		this.distance = distance;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		if(this == obj) {
			return true;
		}
		
		if(!(obj instanceof Town)) {
			return false;
		}
		
		Town newTown = (Town) obj;
		if(this.distance == newTown.distance && this.town.equals(newTown.town)) {
			return true;
		}
		return false;
	}
	
	@Override
	public int compareTo(Object obj) {
		Town otherTown = (Town) obj;
		int result = this.distance - otherTown.distance;
		if(result == 0) {
			return this.town.compareTo(otherTown.town);
		}
		return result;
	}
}
