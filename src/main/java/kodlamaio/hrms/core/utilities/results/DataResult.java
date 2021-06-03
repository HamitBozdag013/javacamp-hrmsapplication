package kodlamaio.hrms.core.utilities.results;

public class DataResult<T> extends Result {
	
	private T data;

	public DataResult(T data, boolean success, String message) {
		super(success, message); //DataResult a gelen success ve message bilgileri base sınıfa yani burada Result(success,message) sınıfına gönderilir
		this.data = data;
	}
	
	public DataResult(T data, boolean success) {
		super(success); //DataResult a gelen success bilgisini base sınıfa yani burada Result(success) sınıfına gönderilir
		this.data = data;
	}
	
	public T getData() {
		return this.data;
	}

}
