import java.util.*;
public class SinglyLinkedClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		SinglyLinked obj = new SinglyLinked();
//		obj.AddLast(1);
//		obj.AddLast(2);
//		obj.display();
//		obj.AddFirst(0);
//		obj.AddFirst(-1);
//		obj.display();
//		System.out.println(obj.GetFirst());
//		System.out.println(obj.GetLast());
//		System.out.println(obj.RemoveFirst());
//		obj.display();
//		System.out.println(obj.RemoveLast());
//		obj.display();
		for(int i =0;i<5;i++) {
			obj.AddLast(i);
		}
		System.out.println(obj.RemoveAt(2));
		obj.Reverse();
		obj.display();
		
		
		
		

	}

	
}
