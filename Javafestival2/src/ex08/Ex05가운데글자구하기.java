package ex08;

public class Ex05가운데글자구하기 {

	public static void main(String[] args) {

		System.out.println(getMiddle("powert"));
	}

	public static String getMiddle(String str) {
		String[] arr = str.split("");
		
		if (str.length()%2==0) {
			return arr[str.length()/2-1] + arr[str.length()/2];
		} else {
			return arr[str.length()/2];
		}		
	}
	
}
