import java.util.*;
public class ReversingStack {
	static Stack<Integer> st = new Stack<>();
	static void Reverse() {
		if(st.size()>0) {
			
			
			
		
		 int rv=st.peek();
		 st.pop();
		Reverse();
		insert(rv);
				}
		
	}
	 static void insert(int x) {
		if(st.isEmpty()) {
			st.push(x);
		}
		else {
			int rv1 = st.peek();
			st.pop();
			insert(x);
			st.push(rv1);
		}
		
	}
	public static void display(Stack<Integer> q) {
		for(int a:q) {
			System.out.print(a+" ");
		}
		System.out.println();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for(int i =0;i<10;i++) {
			st.push(i);
		}
		System.out.println(st);
//		display(st);
		Reverse();
		System.out.println(st);
		
		

	}

}
