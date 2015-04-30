
public class ExceptionTest {
	public static void main(String[] args) {
		try {
			int a = 0;
			double b;
			b = 100/a; //java.lang.ArithmeticException 발생
			System.out.println("Some more codes"); //예외 발생으로 수행되지 않음
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			System.out.println("예기치 못한 오류로 프로그램을 종료합니다.");
			return;
		}finally{
			System.out.println("자원정리");
		}
		System.out.println("Some more codes");
	}
}
