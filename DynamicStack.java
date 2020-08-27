
public class DynamicStack extends StackArray{
	
	public DynamicStack() throws Exception{
		this(CAPACITY);
	}
	public DynamicStack(int x) throws Exception{
		super(x);
	}
	public void push(int x) throws Exception {
		if(this.size()==this.data.length) {
			int[] arr = new int[2*this.data.length];
			for(int i =0;i<this.top;i++) {
				arr[i] = this.data[i];
			}
			this.data = arr;
			
		}
		super.push(x);
	}
	
}
