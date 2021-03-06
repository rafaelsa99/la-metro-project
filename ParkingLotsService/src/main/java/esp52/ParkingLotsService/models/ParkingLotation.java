package esp52.ParkingLotsService.models;

public class ParkingLotation {
	private String name; // Parking lot identifier
	private int updated; 
	private int disabledtotal; //Total disabled parking places
	private int disabledfree; //Number of free disabled parking places
	private int free; //Number of free parking places
	private int total; //Total parking places
	
	
	public int getUpdated() {
		return updated;
	}
	public void setUpdated(int updated) {
		this.updated = updated;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDisabledtotal() {
		return disabledtotal;
	}
	public void setDisabledtotal(int disabledtotal) {
		this.disabledtotal = disabledtotal;
	}
	public int getDisabledfree() {
		return disabledfree;
	}
	public void setDisabledfree(int disabledfree) {
		this.disabledfree = disabledfree;
	}
	public int getFree() {
		return free;
	}
	public void setFree(int free) {
		this.free = free;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
}
