package 이중for문;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Ex01구구단 {
	public static void main(String[] args) {

		// 구구단
		for (int i = 2; i < 10; i++) {
			System.out.print(i + "단 : ");
			for (int j = 1; j < 10; j++) {
//				System.out.print(i + "*" + j + "=" + j * i + " ");
				String res = String.format("%d*%d=%d\t", i, j, i * j);
				System.out.print(res);
			}
			System.out.println();
		}

		// 현재 날짜 구하기 (시스템 시계, 시스템 타임존)
		LocalDate now = LocalDate.now();

		System.out.println(now);
		// 날짜, $< 로 상대 인덱스를 지정하고 직전의 인수와 같은 것을 이용
		String result = String.format("날짜 서식: %tY년 %<tm월 %<td일", now);
		System.out.println(result); // 날짜,시간 서식: 2020년 08월 23일 14시 55분 55초

		// 현재 시간
		LocalTime now2 = LocalTime.now();
		System.out.println(now2);

		// 현재 날짜/시간
		LocalDateTime now3 = LocalDateTime.now();

		// 현재 날짜/시간 출력
		System.out.println(now3); // 2021-06-17T06:43:21.419878100

		// 포맷팅
		String formatedNow = now3.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초"));
		// 포맷팅 현재 날짜/시간 출력
		System.out.println(formatedNow); // 2021년 06월 17일 06시 43분 21초

	}
}
