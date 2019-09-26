package lesson.two;

/**
 * @author lipc
 * simulate data structure of stack
 */
public class LessonTwoDataStructureStack {
	private int[] data;
	private int size;

	/**
	 * point to top of stack
	 */
	private int top = 0;

	/**
	 * @param size
	 */
	public LessonTwoDataStructureStack(int size) {
		this.size = size;
		this.data = new int[size];
	}

	/**
	 * push num to stack;
	 *
	 * @param num data pushed into stack
	 */
	public void push(int num) {
		data[top++] = num;
	}

	public int pop() {
		if (top > 0) {
			return data[--top];
		} else {
			return data[top];
		}
	}

	public int getTop() {
		if (top > 0) {
			return data[top - 1];
		} else {
			return data[top];
		}
	}

	public boolean isEmpty() {
		return top == 0;
	}

	public int[] returnData() {
		return data;
	}
}
