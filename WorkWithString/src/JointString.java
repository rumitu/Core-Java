
public class JointString {

	public String stichMeUp(String glue, Object ...arr ){
		StringBuilder sb= new StringBuilder();

		for(Object tempString:arr){
		   sb.append(tempString).append(glue);   
		 }
		return sb.toString();
		
		
	}
	//public static void main(String[] args) {
		//System.out.println(stichMeUp(" ", "Днес", "видях", 5, "ходещи", "медузи"));
	

	//}

}
