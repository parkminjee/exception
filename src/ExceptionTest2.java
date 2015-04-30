
public class ExceptionTest2 {
	public static void main(String[] args) {
		ThrowTest tt = new ThrowTest();
		
		//Unchecked
		//tt.suspiciousMethod();
		try{
			tt.suspiciousMethod3();
		}catch(Exception ex){
			System.out.println("예외가 발생했습니다.:"+ex);
		}
	}
}
