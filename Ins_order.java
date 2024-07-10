public class Ins_order{
	class Node{
		int info;
		Node link;
		
		 public Node(int data){
		 	this.info=data;
		 	this.link=null;
		 }
	}
	public Node first=null;
	public void insertAtOrder(int data){
		Node newNode=new Node(data);
		if(first==null || newNode.info<=first.info){
			newNode.link = first;
			first = newNode;
			return;
		}
		Node current;
		while(current.link !=null && newNode.info>=current.info){
			current = current.link;
		}
		newNode.link = current.link;
		current.link=newNode;
	}
}