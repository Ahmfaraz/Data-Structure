


public class DynamicClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		StackArray obj = new DynamicStack();
		for(int i =0;i<10;i++) {
			obj.push(i*20);
		}
		obj.push(222);
		obj.display();

	}

}
