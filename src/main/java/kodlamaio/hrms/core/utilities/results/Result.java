package kodlamaio.hrms.core.utilities.results;

public class Result {
	private boolean success;
	private String message;
	
	public Result(boolean success) {
		this.success = success;
		
	}
	
	public Result(boolean success, String message) {
		this(success); // Burada this.success = success şeklinde de yazabiliriz fakat kendimizi tekrar etmemek için bu şekilde
					   // üstteki tek parametreli Result ı set ediyoruz.
		this.message = message;
	}
	
	public boolean isSuccess() {
		return this.success;
	}
	
	public String getMessage() {
		return this.message;
	}

}
