
public class Exam_01_Variable_02 {
public static void main(String[] ar) {
		
		System.out.println(10 / 3);
		// 자바는 똑똑하지 않아서 정수끼리 나눴을 때 실수가 나오지 않는다.
		System.out.println(10 / 3.0);
		// 해결
		
		//-----------------------------------------------------
		
		int sum = 98;
		System.out.println("당신의 총점은" + sum + "점");
		//promotion 예시
		
		byte b = 0;
		short s = 100;
		b = (byte)s;
		System.out.println(b);
		// casting 예시
		// casting할 때는 원하는 변수 앞에 (데이터형타입)을 적어주면 된다.
	}
}
