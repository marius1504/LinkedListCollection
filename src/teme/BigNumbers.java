package teme;

import java.util.LinkedList;

public class BigNumbers {
	public LinkedList<Integer> sumBn(LinkedList<Integer> op1, LinkedList<Integer> op2){
		
		LinkedList<Integer> rez = new LinkedList<>();
		
		if(op1.size() > op2.size()) {
			LinkedList<Integer> aux = op1;
			op1 = op2;
			op2 = aux;
		}
		
		int carry = 0;
		int sum = 0;
		
		while(!op1.isEmpty()) {
			sum = op1.getLast() + op2.getLast();
			rez.addFirst(sum%10 + carry);
			carry = sum/10;
			op1.removeLast();
			op2.removeLast();
		}
		
		while(!op2.isEmpty()) {
			rez.addFirst(op2.getLast() + carry);
			carry = 0;
			op2.removeLast();
		}
		return rez;
	}
	
	public static String noToString(LinkedList<Integer> list) {
		String rez = "";
		for(Integer el : list) {
			rez += el;
		}
		return rez;
	}
	
	public static void main(String[] args) {
		System.out.println(" Checking input...");
		
		LinkedList<Integer> op1 = new LinkedList<>();
		op1.add(2);
		op1.add(1);
		op1.add(7);
		op1.add(8);
		System.out.println(noToString(op1));
		
		LinkedList<Integer> op2 = new LinkedList<>();
		op2.add(5);
		op2.add(9);
		op2.add(6);
		System.out.println(noToString(op2));
		
		BigNumbers sum = new BigNumbers();
		
		System.out.println(noToString(sum.sumBn(op1, op2)));
		
	}
}
