package com.bridgelabz.util;

public class LinkedList<T>
{
        private Node<T> head;
	    private Node<T> tail;
	    private int size=0;
		
	    public boolean isEmpty() {
			return head == null;
		}
	    public String addElement(T element)
	    {     
	        Node<T> nd = new Node<T>();
	        nd.setValue(element);
	        size++;
	        System.out.println(element);
	        
	        /**
	         * check if the list is empty
	         */
	        if (isEmpty()) {
				// since there is only one element, both head and
				// tail points to the same object.
				head = nd;
				tail = nd;
			} else {
				// set current tail next link to new node
				tail.setNextRef(nd);
				// set tail as newly created node
				tail = nd;
			}
			return null;
	    }
	    public void deleteAfter(T key){
	         
	        Node<T> tmp = head;
	        Node<T> refNode = null;
	        System.out.println("Traversing to all nodes..");
	        /**
	         * Traverse till given element
	         */
	        while(true){
	            if(tmp == null){
	                break;
	            }
	            if(tmp.compareTo(key) == 0){
	                //found the target node, add after this node
	                refNode = tmp;
	                break;
	            }
	            tmp = tmp.getNextRef();
	        }
	        if(refNode != null){
	            tmp = refNode.getNextRef();
	            refNode.setNextRef(tmp.getNextRef());
	            if(refNode.getNextRef() == null){
	                tail = refNode;
	            }
	            System.out.println("Deleted: "+tmp.getValue());
	        } else {
	            System.out.println("Unable to find the given element...");
	        }
	    }
	  public void delete(String key) {
		  
	  }
	public void traverse(){
	         
	        Node<T> tmp = head;
	        while(true){
	            if(tmp == null){
	                break;
	            }
	            System.out.println(tmp.getValue());
	            tmp = tmp.getNextRef();
	        }
	   
	   }
	public void remove(T item) {
		Node<T> n = head;
		Node <T>prev = null;
		if (head.key.equals(item)) {
			head = head.getNextRef();
			size -= 1;
			return;
		}
		while (!n.key.equals(item)) {
			prev = n;
			n = n.getNextRef();
		}
		n = n.getNextRef();
		prev.setNextRef(prev.getNextRef()) ;
		n = null;
		size -= 1;
	}
		public boolean searchKey(String key)
	    {
			int i=1;
			 Node<T> current = head;  
		    
		        boolean flag = false;  
		        //Checks whether list is empty  
		        if(head == null) {  
		            System.out.println("List is empty");  
		        }  
		        else {  
		            while(current != null) {  
		                 //Compares node to be found with each node present in the list  
		                if(current.key == key) {  
		                    flag = true;  
		                    break;  
		                }  
		               
						i++;  
		                current = current.getNextRef();  
		            }  
		        }  
		        if(flag==true) { 
		             System.out.println("Element is not present in the list " );  
		        }
		         flag=true;
		             
//	                 
//		         else  
//		        {  
//		        	System.out.println("Element is  present in the list"); 
//		        }
//		        	flag=false;
		        
			return flag;
	    }
}
   


