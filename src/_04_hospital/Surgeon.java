package _04_hospital;

public class Surgeon extends Doctor{

	public Object makesHouseCalls() {
		return false;
	}
	public Object performsSurgery() {
		return true;
	}
}
