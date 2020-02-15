package teme;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class RemoveDuplicates {
	private List<Integer> elements = new LinkedList<>();
	
	public boolean addELement(Integer el) {
		ListIterator<Integer> it = elements.listIterator();
		
		while(it.hasNext()) {
			int compare = it.next().compareTo(el);
			
			if(compare < 0) {
			}else if(compare >= 0) {
				it.previous();
				it.add(el);
				return true;
			}else {
				return false;
			}
		}
		it.add(el);
		return true;
	}
	
	public void removeDuplicates21() {
		ListIterator<Integer> it = elements.listIterator();
		
		if(it.hasNext()) {
			Integer previousElement = it.next();
			while(it.hasNext()) {
				Integer nextElement = it.next();
				if(previousElement.compareTo(nextElement) == 0) {
					it.remove();
				}
				previousElement = nextElement;
			}
		}
	}
	
	public void removeDuplicates22() {
		ListIterator<Integer> it = elements.listIterator();
		
		if(it.hasNext()) {
			Integer previousElement = it.next();
			while(it.hasNext()) {
				Integer nextElement = it.next();
				if(previousElement.compareTo(nextElement) == 0) {
					it.remove();
					if(it.hasPrevious()) {
						it.previous();
						it.remove();
					}
				}
				previousElement = nextElement;
			}
		}
	}
	
	@Override
	public String toString() {
		String rez = "";
		for(Integer el : elements) {
			rez += "\t " + el + " ";
		}
		return rez;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveDuplicates list = new RemoveDuplicates();
		
		list.addELement(1);
		list.addELement(1);
		list.addELement(2);
		list.addELement(2);
		list.addELement(2);
		list.addELement(9);
		list.addELement(9);
		list.addELement(10);
		
		System.out.println(list);
		
		list.removeDuplicates22();
		
		System.out.println(list);
	}

}
