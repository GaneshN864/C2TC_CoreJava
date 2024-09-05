package admin.ganesh.day2;

public class encap {
	int a;
	String a1;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public String getA1() {
		return a1;
	}
	public void setA1(String a1) {
		this.a1 = a1;
	}
	@Override
	public String toString() {
		return "encap [a=" + a + ", a1=" + a1 + ", getA()=" + getA() + ", getA1()=" + getA1() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
