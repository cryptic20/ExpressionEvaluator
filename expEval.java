import java.io.*;
import java.util.Stack;

public final class expEval{

	public static void main(String[]args){
		/*assuming the rule <operator> <expression> <expression> and all string input are valid statements.
		assuming rule of "a + b" for addition and "a - b" for subtraction.
		similarly, division will be a / b and will return an int for simplicity.*/
		
		String[] token = (new String(args[0])).split(" ");//get string input from console delimited by space

		Stack<Integer> stack = new Stack<Integer>();

        //for loop will start at the end of array for reverse polish notation via stack. 
        for(int i = token.length-1; i>=0 ; i--) {
            switch(token[i]) {

           	/*when it detects an operator, will 
           	pop the previous expression and performs the 
           	specified operator and the result will be push into the stack again*/
            case "+":
                st.push(stack.pop() + stack.pop()); //addition a + b
                break;
            case "-":
                st.push(stack.pop() - stack.pop()); //subtraction a - b
                break;
            case "*":
                st.push(stack.pop() * stack.pop()); //multiplication a * b
                break;
            case "/":
                st.push(stack.pop()/stack.pop()); //division a/b
                break;
            default:
                st.push(Integer.parseInt(token[i])); //will push any expression
                break;
            }
        }
        if(!stack.isEmpty()){
            System.out.println("result: "+ st.pop()); //return the result after performing all necessary operations
        }else{
            System.out.println("Error! Invalid expression!")
        }
    }
}
