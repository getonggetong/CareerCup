/*
	这特么我写的！张
*/


public class CC1_8 {
	String s1;
	String s2;
	public CC1_8(String s1, String s2) {
		this.s1 = s1;
		this.s2 = s2;
	}

	public boolean compare(){
		boolean sub = false;
		if(s1.length() == s2.length()) {
			s1 = s1.concat(s1);
			if(s1.indexOf(s2) >= 0)
				sub = true;
		}
		
		return sub;
	}

	public static void main(String[] args) {
		CC1_8 test = new CC1_8("abc","cabaa");
		if(test.compare()) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}