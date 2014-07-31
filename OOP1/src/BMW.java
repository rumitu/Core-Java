
public class BMW extends Car {
	public String toSrting(){
		return getClass().getName() + '@' + getClass().hashCode();
	}

}
