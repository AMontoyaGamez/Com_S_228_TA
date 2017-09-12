package exception_handling;

public class RandomException extends RuntimeException{
	private String message;
	public RandomException(){
		message = "None";
	}
	public RandomException(String message){
		this.message = message;
	}
	
	public String toString(){
		return message;
	}
}
