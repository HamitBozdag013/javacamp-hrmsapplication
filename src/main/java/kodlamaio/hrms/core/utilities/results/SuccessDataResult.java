package kodlamaio.hrms.core.utilities.results;

public class SuccessDataResult<T> extends DataResult<T> {

	public SuccessDataResult(T data, String message) {
		super(data, true, message);	
	}
	
	public SuccessDataResult(T data) {
		super(data,true);
	}
	
	//Buradan sonrakilerle yukarıdakilere alternatifler oluşturuyoruz. Yazılımızın kullanışlılığını arttırır, yazmasakta çalışmasında bir sorun olmaz
	
	public SuccessDataResult(String message) {
		super(null, true, message);	 // kullanıcı success ve message ile birlikte data yı null olarak döndürebilir
	}
	
	public SuccessDataResult() {
		super(null, true);	// kullanıcı success ile birlikte data yı null olarak döndürebilir
	}

}
