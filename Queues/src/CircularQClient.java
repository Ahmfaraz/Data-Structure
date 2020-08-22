
public class CircularQClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		CircularQueue obj = new CircularQueue();
		for(int i=1;i<6;i++) {
			obj.Enqueu(i);
		}
		obj.Dequeue();
		obj.Dequeue();
		obj.Enqueu(22);
		obj.Enqueu(234);
		
		while(!obj.IsEmpty()) {
			System.out.println(obj.top());
			obj.Dequeue();
		}
		

	}

}
