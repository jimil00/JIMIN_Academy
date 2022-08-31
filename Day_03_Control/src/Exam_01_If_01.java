import java.util.Scanner;

public class Exam_01_If_01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("당신이 좋아하는 과일을 선택하세요.");
		System.out.println("1. 사과 / 2. 망고 / 3. 포도");
		System.out.print(">> ");
		
		int menu = Integer.parseInt(sc.nextLine());
		
		if(menu == 1) {
		//만약에 메뉴 안에 있는 값이 1과 같다면 
        //true면 중괄호 안에 것들이 실행되고 flase면 실행되지 않는다.
			
			System.out.println("사과는 영어로 Apple 입니다.");
			
		}else if(menu == 2) {
		//그렇지 않아? 그럼  만약에 2와 같다면 	
			
			System.out.println("망고는 영어로 Mango 입니다.");
			
		}else if(menu == 3) {
			
			System.out.println("포도는 영어로 Grape 입니다.");
			
		}else {
		//위에 것들이 다 아니라면	
			System.out.println("메뉴를 다시 확인해주세요.");
		}
	
		
		}
	}

}