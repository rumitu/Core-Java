import java.util.Stack;


public class CheckExpression {

	public boolean isCorrectExpression(String expression){
		Stack<Integer> stack = new Stack<Integer>();
		boolean correctBrackets=true;
		for (int index = 0; index < expression.length(); index++) {
			char ch = expression.charAt(index);
			if (ch == '(') {
				stack.push(index);
			} else if (ch == ')') {
				if(stack.isEmpty()){
					correctBrackets=false;
					break;
				}
				stack.pop();
				}
		}
		if(!stack.isEmpty())
		correctBrackets=false;
		return correctBrackets;		
	}

}
