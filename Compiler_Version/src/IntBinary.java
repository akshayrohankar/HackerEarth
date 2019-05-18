import java.util.LinkedList;

public class IntBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 20,bit_pos=5;
		System.out.println("Number is :"+i);
		String str = Integer.toBinaryString(i);
		System.out.println("Binary is :"+str);
		System.out.println("BitCount is :"+Integer.bitCount(i));

		char[] charArr = str.toCharArray();
		System.out.println(charArr);
		System.out.println("Bit at that position :"+charArr[bit_pos-3]);
		
		
		
		
		
		
		
		
		
		
		
		/*
		LinkedList ls = new LinkedList();
		ls.add(1);
		ls.add(2);
		ls.addFirst(5);
		ls.addLast(9);
		
		
		
		System.out.println(ls);*/
		
	}

}
