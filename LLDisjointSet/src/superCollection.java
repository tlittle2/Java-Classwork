import java.util.LinkedList;

public class superCollection {
	
	LinkedList<LinkedList> superList= new LinkedList<LinkedList>();

	public superCollection() {
		// TODO Auto-generated constructor stub
	}
	
	
	public void makeSet(int n){
		LinkedList<Integer> newList= new LinkedList<Integer>();
		newList.add(n);
		superList.add(newList);
		
		
	}
	
	public int findSet(int n) {
		Integer x = null;
		for(int i = 0; i < superList.size(); i++) {
			if(superList.get(i).contains(n)) {
				x= (Integer) superList.get(i).getFirst();
				
			}
		
			
		}
		return x;
	}
	
	


	public LinkedList<Integer> find(int n){
		LinkedList<Integer> list= null;
		for(int i = 0; i < superList.size(); i++) {
			if(superList.get(i).contains(n)) {
				list= superList.get(i);
		
			}
		}
		return list;
	}
	
	
	public void union(int x, int y) {

		LinkedList<Integer> list1= this.find(x);
		LinkedList<Integer> list2= this.find(y);
		LinkedList<Integer> shorterList; 
		LinkedList<Integer> longerList;
		if(list1.size() < list2.size()){
			shorterList = list1;
			longerList = list2;
			
		}else {
			shorterList = list2;
			longerList = list1;
		}
	
		
		for(int d: shorterList) {
			longerList.add(d);
			
		}
		
		superList.remove(shorterList);
		
	}
	
	@Override
	public String toString() {
		return "superList " + superList + "";
	}

}
