package lesson.two;

import java.util.Arrays;

/**
 * @author lipc
 */
public class PostfixExpression {
	private int[] transStringToNumber = new int[2];

	public void consoleLog(String args) {
		System.out.println(args);
		System.out.println(transStringToNumber.length);
	}

	public void getParameterFromMain(String args) {
		int result = 0;
		for (int i = 0; i < args.length(); i++) {
			// this is means we need calculated previous input data
			if (args.charAt(i) == '-' || args.charAt(i) == '+' || args.charAt(i) == '*' || args.charAt(i) == '/') {
				switch (args.charAt(i)) {
					case '+':
						System.out.println(" 222 +++ ");
						result = transStringToNumber[0] + transStringToNumber[1];
						break;
					case '-':
						result = transStringToNumber[0] - transStringToNumber[1];
						System.out.println(" 222 --- ");
						break;
					case '*':
						System.out.println(" 222 *** ");
						result = transStringToNumber[0] * transStringToNumber[1];
						break;
					case '/':
						System.out.println(" 222 /// ");
						result = transStringToNumber[0] / transStringToNumber[1];
						break;
					default:
				}
				// set the stack empty
				transStringToNumber[0] = -1;
				transStringToNumber[1] = -1;
			} else {
				System.out.println("Start set value on stack");
				int i1 = Integer.parseInt(String.valueOf(args.charAt(i)));
				if (transStringToNumber[0] == transStringToNumber[1]) {
					transStringToNumber[0] = i1;
				} else {
					transStringToNumber[1] = i1;
				}
			}
		}
		System.out.println(Arrays.toString(transStringToNumber));
		System.out.println(result);
	}

	public void pop() {

	}
}
