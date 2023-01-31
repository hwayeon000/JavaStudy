package question6;

import java.util.ArrayList;

public class MusicController {

	ArrayList<MusicVO> musicList = new ArrayList<>();
	int cnt = 0;
	// 확인용 가 데이터
	public MusicController() {
		musicList.add(new MusicVO("OMG", "NewJean", 117));
		musicList.add(new MusicVO("DITTO", "NewJean", 200));
		musicList.add(new MusicVO("FANCY", "TWICE", 117));
		musicList.add(new MusicVO("DallaDalla", "Itzy", 100));
		musicList.add(new MusicVO("벌써 12시", "CHUNG HA", 100));
	}
	
	public void musicList(String title, String singer, int playTime) {
		MusicVO mv = new MusicVO();
		mv.setTitle(title);
		mv.setSinger(singer);
		mv.setPlayTime(playTime);
		musicList.add(mv);
	}

	// 전체
	public void musicListShow() {
		for (int i = 0; i < musicList.size(); i++) {
			System.out.println(toString1(i));
		}
	}
	// 하나 재생
	public void musicOneShow() {
		System.out.println(toString1(cnt));
	}
	
	// 다음곡
	public void nextMusic() {
		cnt++;
		if (cnt >= musicList.size()) cnt = musicList.size()-1;
		System.out.println(toString1(cnt));
	}
	
	// 이전곡
	public void preMusic() {
		cnt--;
		if (cnt < 0) cnt = 0;
		System.out.println(toString1(cnt));
	}
	
	public String toString1(int i) {
		String title = musicList.get(i).getTitle();
		String singer = musicList.get(i).getSinger();
		int playTime = musicList.get(i).getPlayTime();
		String res = "제목 : " + title + ",\t" + "가수 : " + singer +  ",\t" + "시간 : " + playTime;
		return res;
	}
	
	public String toString() {
		
		String title = musicList.get(0).getTitle();
		String singer = musicList.get(0).getSinger();
		int playTime = musicList.get(0).getPlayTime();
		String res = "제목 : " + title + ",\t" + "가수 : " + singer +  ",\t" + "시간 : " + playTime;			
		
		
		return res;
	}
	
	
}
