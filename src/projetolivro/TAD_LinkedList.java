package projetolivro;

public interface TAD_LinkedList {
        public boolean isEmpty();   
        public int size();  
	public String toString(); 
        public Object addFirst(Object item);
        public Object addLast(Object item);
        public Object removeFirst();
        public Object peekFirst();
        public Object peekLast();
        public Object[] toArray();   
        public void clear();
        public Object add(int idx, Object item);
        public Object remove(int idx);
        public boolean remove(Object x);
        public boolean contains(Object x);
}
