package projetolivro;

public class LinkedList implements TAD_LinkedList{
    
    private Node head=null, tail=null;  
        private int size = 0;  
                
        public LinkedList() { 
            head = null; tail = null; size = 0;
        }
                
    @Override
        public boolean isEmpty() {
        return head == null; 
        }
        
    @Override
        public int size() {
            return size;
        }
        
    @Override
        public Object peekFirst() { 
            if(head == null) return null; else return head.getValue();
        }
                
    @Override
        public Object peekLast() { 
            if(head == null) return null; else return tail.getValue();
        }

    @Override
	public Object addFirst(Object x) {
            if(x == null)return null;
	    try { 
                Node novo = new Node();
                novo.setValue(x);
                novo.setNext(null);
                if (head == null) {
                    head = novo;
                    tail = novo;
                }
                else {
                    novo.setNext(head);    
                    head = novo;
                }
                size++;  
                return x;
            } catch(Exception ex) {
                return null; 
            }
	}
        
    @Override
	public Object addLast(Object x) {
            if(x == null)return null;
	    try { 
                Node novo = new Node();
                novo.setValue(x);
                novo.setNext(null);
                if (head == null) head = novo; else tail.setNext(novo);    
                tail = novo;
                size++; 
                return x;
            } catch(Exception ex) {
                return null; 
            }
	}

    @Override
        public Object removeFirst() {
            if (head == null) return null;  
            Object value = head.getValue();
            Node temp = head; 
            head = head.getNext();
            if( head == null)tail=null;
            temp.setNext(null); 
            temp = null; 
            size--;
            return value;
        }        

	
    @Override
	public String toString (){ 
		if( !isEmpty() ) {
			String saida = "\n";
                        Node aux = head;
			while( aux!=null ) { 
				saida += aux.getValue().toString();  
                                aux = aux.getNext();
                                if ( aux != null )  saida += "\n"; 
			}
                        return ( "Lista: " + saida + " \n" );
		}
                else return ( "lista: [ ]" ); 
        }
        
    @Override
        public void clear () {
            Node aux = head;
            while(aux != null) {
                Node tmp = aux;
                aux = aux.getNext();
                
                tmp.setNext(null); 
                tmp = null;
            }
            head = null; tail = null; size = 0;            
        }
        
    @Override
        public Object[] toArray() {
           if(isEmpty()) return null;
           try {
                Object[] vetor = new Object[size];
                int i = 0;
                Node aux = head;
                while (aux != null) {
                    vetor[i++] = aux.getValue();
                    aux = aux.getNext();
                }           
                return vetor;   
           }
           catch(Exception exc) { return null; }
        }
        
        public Object remove(int idx) { 
            if(isEmpty() || idx < 0 || idx >= size) return null; 
            int pos = 0;  Node next = head, prev = null; 
            
            while(pos != idx) { 
                prev = next;
                next = next.getNext();
                pos++;
            }
            Object value = next.getValue(); 
            if(prev != null) prev.setNext(next.getNext()); 
            if(idx == 0) head = head.getNext(); 
            if(idx == size-1) tail = prev;  
            if(head == null) tail = null;  
            next.setNext(null); next = null; 
            size--; 
            return value;
        }
        
    @Override
        public Object add(int idx, Object x) { 
            if(idx < 0 || idx > size || x == null) return null; 
            if(idx == size) { 
                Object res = addLast(x);  return res;
            }
            Node novo = null;
            try {
                novo = new Node();
                novo.setValue(x); novo.setNext(null);
            }
            catch (Exception ex) { return null; } 
            int pos = 0;  Node next = head, prev = null; 
            
            while(pos != idx) { 
                prev = next; next = next.getNext(); pos++;
            }  
            if(isEmpty()) {
                head = novo; tail = novo; 
            }
            else if(idx == 0) {
                novo.setNext(head);  head = novo;
            }
            else { 
                prev.setNext(novo);  novo.setNext(next);
            }
            size++; 
            return x; 
        }
    
        
    @Override
        public boolean remove(Object x) {
            if(isEmpty() || x == null) return false; 
            Node next = head, prev = null; boolean achou = false;
            
            while(next!=null && !achou) { 
                if(x.toString().equalsIgnoreCase(next.getValue().toString())) {
                    achou = true; break;
                }
                prev = next;
                next = next.getNext();
            }
            if(!achou) return false; 
            Object value = next.getValue(); 
            if(prev != null) prev.setNext(next.getNext()); 
            if(prev == null) head = head.getNext(); 
            if(next.getNext() == null) tail = prev;  
            if(head == null) tail = null;  
            next.setNext(null); next = null; 
            size--; 
            return true;
        }              
        
        
    @Override
        public boolean contains(Object x) {
            if(x == null)return false;
            Node aux = head; 
            boolean encontrado = false;
            while (aux!=null && !encontrado) {                
                if(x.toString().equalsIgnoreCase(aux.getValue().toString())) encontrado = true;
                
                aux = aux.getNext();
            }
            return encontrado;
        }
    
}
