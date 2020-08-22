
public class CircularQueue {
	private int[] arr;
	//private int max;
	private int count;
	private int front;
	private int rear;
	public static final int CAPACITY =5;
	CircularQueue() {
		this(CAPACITY);
	}
	CircularQueue(int size){
		this.arr = new int[size];
		this.front=0;
		this.rear = size-1;
		this.count=0;
	}
	public boolean IsEmpty() {
		if(this.count==0) {
			return true;
		}
		return false;
	}
	public boolean IsFull() {
		if(this.count==this.arr.length) {
			return true;
		}
		return false;
	}
	public void Enqueu(int x ) {
		if(!this.IsFull()) {
			this.rear = (this.rear+1)%this.arr.length;
			this.arr[this.rear]=x;
			this.count++;	
		}
		else {
			System.out.println("Queue is full");
		}
	}
	public void Dequeue()  {
		if(!this.IsEmpty()) {
			this.front=(this.front+1)%this.arr.length;
			//int rv = this.arr[this.rear];
			this.count--;
			//return rv;
		}
		
	}
	public int top() {
		return this.arr[this.front];
	}
//	public void display() {
//		if()
//	}

}
