
public class MaximumScalar {

	public long maximumScalar(int [] a, int [] b) {
		long result =0;
		for(int i = 0; i<a.length; i++){
			result = a[i] + b[i];
		}
		return result;
	}
}
