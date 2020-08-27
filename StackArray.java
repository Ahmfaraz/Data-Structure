
public class StackArray {
	protected int[] data;
	protected int top;
	public static final int CAPACITY = 10;
	public StackArray() throws Exception {
		this(CAPACITY);
	}
	public StackArray(int capacity) throws Exception{
		if(capacity<1) {
			throw new Exception("size is too small");
		}
		this.data= new int[capacity];
		this.top=-1;
	}
	public int size() {
		return this.top+1;
	}
	public boolean IsEmpty() {
		if(this.size()==0) {
			return true;
		}
		return false;
	}
	public void push(int x) throws Exception{
//		if(IsEmpty()) {
//			throw new Exception("Stack is full");
//		}
		this.top++;
		this.data[this.top]=x;
	}
	public int pop() throws Exception {
		if(this.size()==0) {
			throw new Exception("Stack is empty");
		}
		int rv = this.data[this.top];
		this.data[this.top]=0;
		this.top--;
		return rv;
	}
	public int top() throws Exception {
		if(this.size()==0) {
			throw new Exception("Stack is empty");
		}
		int rv = this.data[this.top];
		return rv;
	}
	public void display() {
		for(int i =this.top;i>=0;i--) {
			System.out.print(this.data[i]+" ");
		}
		System.out.println("END");
	}
	
}
