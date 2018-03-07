import java.io.*;
import java.util.Stack;

public final class expEval{

	public static void main(String[]args){

		//get input from console
		String[] token = (new String(args[0])).toString().split(" ");
		Stack<Integer> st = new Stack<Integer>(); //using stack because 

        //for loop start at the end for reverse polish notation.
        for(int i = token.length-1; i>=0 ; i--) {
            switch(token[i]) {
            case "+":
                st.push(st.pop() + st.pop());
                break;
            case "-":
                st.push(st.pop() - st.pop());
                break;
            case "*":
                st.push(st.pop() * st.pop());
                break;
            case "/":
                st.push(st.pop()/st.pop());
                break;
            default:
                st.push(Integer.parseInt(token[i]));
                break;
            }
        }
        System.out.println("result: "+st.pop());
    }
   }