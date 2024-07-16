public class SLL{
	public class Node{
		int info;
		Node link;

		Node(int data)
		{
			this.info = data;
			this.link = null;
		}
	}

	public Node first = null;

	void insertAtFirst(int data)
	{
		Node newNode = new Node(data);
		if(first==null)
		{
			System.out.println("empty");
			first = newNode;

		}
		else{
			System.out.println("not empty");
			newNode.link = first;
			first = newNode;
		}
	}
	void insertAtLaast(int data){
		if(first==null){
			first=newNode;
		}
		else{
			Node save =first;
			while(save.link!=null)
			{
				save=save.link;
			}
		}
		save.link=newNode;
	}
}

void insertAtOrder(int data)
	{
		Node newNode = new Node(data);
		if(first==null)
		{
			System.out.println("empty");
			first = newNode;

		}
		else{
			System.out.println("not empty");
			if(newNode.info<=first.info){
				newNode.link=first;
				first = newNode;
			}
			else{
				Node save=first;
				while(save.link!=null && newNode.info>=save.link.info){
					save=save.link;
				}
				newNode.link=save.link;
				save.link=newNode;
			}
		}
	}


	void DeleteNode(int data){
		if(first==null){
			System.out.println("empty");
		}
		else{
			if(first.info==data){
				first=first.link;
			}
			else{
				Node save=first;
				Node pred;

				while(save.link!=null && save.info!=data){
pred=save;
save=save.link;
				}
				pred.link=save.link;
			}
}
}

public void DisplayLinkedList()
{
	if(first==null){
		System.out.println("empty");
	}
	else{
		Node temp=first;
		while(temp!=null){
			System.out.print(temp.info+" ");
			temp=temp.link;
		}
		sop( )
	}
}