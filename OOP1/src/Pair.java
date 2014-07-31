
public class Pair {
	private Object firstElement;
	private Object secondElement;
	
	Pair(Object first, Object second){
		firstElement = first;
		secondElement = second;
	}
	
	public Object getfirstElement(){
		return firstElement;
	}
	public Object getsecondElement(){
		return secondElement;
	}

	public void setfirstElement(Object obj){
		firstElement = obj;
	}
	public void setsecondElement(Object obj){
		secondElement = obj;
	}
	
	public boolean IsEquals(Object obj){
		if(obj instanceof Pair){
			if(firstElement.equals(((Pair) obj).getfirstElement()) && secondElement.equals(((Pair) obj).getsecondElement()))
				return true;
		}
		return false;
		
		
	}

}
