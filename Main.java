/*We are given node as prev_node, insert a node after the given node.*/
public void InsertAfter(Node prev_node, int new_data){
/* 1. Check if the given previous node is NULL.*/
if(prev_node==null){
System.out.println("The given previous node can not be NULL.");
return;
}
/* 2. Allocate Node.
* 3. Put in the data.*/
Node new_Node = new Node(new_data);
/* 4. Make next of previous node as new_Node.*/
prev_node.next=new_Node;
/* 5. Make next of new_Node as next of prev_node.*/
new_Node.next=prev_node.next;
/* 6. Make prev_node as previous of new_Node.*/
new_Node.prev=prev_node;
/* 7. Change previous of new_Node's next node.*/
new_Node.next.prev=new_Node;
}
