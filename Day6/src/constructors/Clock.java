package constructors;

public class Clock {
	private int hour;
	private int minute;
	private int second;
	
	public Clock() {
		
	}
	public Clock(int h) {
		this(h, 0, 0);
	}
	public Clock(int h, int n){
		
	}
	public Clock (int  h , int m, int s) {
		
	}
	
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	public String toString() {
		return "H:" + hour + "M:" + minute + "5" + second;
	}

}
