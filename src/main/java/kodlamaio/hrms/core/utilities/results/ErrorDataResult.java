package kodlamaio.hrms.core.utilities.results;

public class ErrorDataResult<T> extends DataResult<T> {

	public ErrorDataResult(T data, String message) {
		super(data, false, message);	
	}
	
	public ErrorDataResult(T data) {
		super(data,false);
	}
	
	//Buradan sonrakilerle yukarıdakilere alternatifler oluşturuyoruz. Yazılımızın kullanışlılığını arttırır, yazmasakta çalışmasında bir sorun olmaz
	
	public ErrorDataResult(String message) {
		super(null, false, message);	 // kullanıcı success ve message ile birlikte data yı null olarak döndürebilir
	}
	
	public ErrorDataResult() {
		super(null, false);	// kullanıcı success ile birlikte data yı null olarak döndürebilir
	}

}
