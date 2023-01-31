package question2;

public class Tv {

	static int channel;
	static String color;
	
	public static void channel(int chan) {
		channel = chan;
	}

	public void color(String color1) {
		color = color1;
	};
	
	public void channelUp() {
		channel++;
	};
	public void channelDown() {
		channel--;
	};
	
	public void print() {
		System.out.println("Tv의 현재 채널은 : " + channel + "이고" + "Tv의 색깔은 " + color + "입니다.");
	}
}
