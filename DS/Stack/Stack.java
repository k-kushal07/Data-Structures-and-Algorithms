class Stack { 
	
	static final int MAX=100;
	int top=-1;
	int[] a=new int[MAX];
	
	boolean push(int x) 
	{ 
		if (top >= (MAX- 1)) { 
			System.out.println("Stack Overflow"); 
			return false; 
		} 
		else { 
			a[++top] = x; 
			System.out.println(x + " pushed"); 
			return true; 
		} 
	} 
	
	int pop() 
	{ 
		if (top < 0) { 
			System.out.println("Stack Underflow"); 
			return 0; 
		} 
		else { 
			int x = a[top--]; 
			return x; 
		} 
	}
		
	int peek() 
	{ 
		if (top < 0) { 
			System.out.println("Stack Underflow"); 
			return 0; 
		} 
		else { 
			int x = a[top]; 
			return x; 
		} 
	}  
	
	public int size()
	{
		return top+1;
	}
 
	public static void main(String args[]) 
	{ 
		Stack stk = new Stack(); 
			
		stk.push(25); 
		stk.push(73); 
		System.out.println(stk.size());
		System.out.println(stk.peek());
		stk.push(24);
		stk.push(27);
		stk.push(27);
		System.out.println(stk.size());
		stk.peek();
		
		System.out.println(stk.pop()); 
		}
}
	
