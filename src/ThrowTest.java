import java.io.IOException;


public class ThrowTest {
	public void suspiciousMethod() throws IOException {
		throw new IOException(); //강제로 예외 발생
	}
	
	public void suspiciousMethod2() throws IOException{
		throw new ArithmeticException();
	}
	
	public void suspiciousMethod3() throws DivideByZeroException{
		throw new DivideByZeroException("영으로 나누지 마세요");
	}
}
