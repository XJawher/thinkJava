package lesson.two;

/**
 * @author lipc
 */
public class PostfixExpression {
	private int[] transStringToNumber = new int[2];

	public void consoleLog(String args) {
		System.out.println(args);
	}

	public void getParameterFromMain(String args) {
		int result = 0;
		for (int i = 0; i < args.length(); i++) {
			// this is means we need calculated previous input data
			if (args.charAt(i) == '-' || args.charAt(i) == '+' || args.charAt(i) == '*' || args.charAt(i) == '/') {
				if (transStringToNumber.length != 2) {
					System.out.println(" 111");
					System.out.println("parameter input error!!!");
				} else {
					System.out.println(" 222");
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
				}
			} else {
				System.out.println(" 333");

				final int i1 = Integer.parseInt(String.valueOf(args.charAt(i)));
				if (transStringToNumber.length == 0) {
					transStringToNumber[0] = i1;
				} else {
					transStringToNumber[1] = i1;
				}
			}
		}

		System.out.println(result);
	}

	public void pop() {

	}
}
