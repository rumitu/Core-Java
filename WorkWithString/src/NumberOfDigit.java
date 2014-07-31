
public class NumberOfDigit {

	public int getNumberOfDigit(int a){
		int length = (int) Math.log10(a) + 1;
		return length;
		
	}

}
