package collectionFrameWork;

public class GrowbleIntArray {
	
	private int arr[];
    private int capacity;
    private int current;

    public GrowbleIntArray() {
        arr = new int[1];
        capacity = 1;
        current = 0;
    }
    
    public void add(int data){

        if (current == capacity) {
        	
            int temp[] = new int[2 * capacity];
            for (int i = 0; i < capacity; i++) {
                temp[i] = arr[i];
            }
  
            capacity *= 2;
            arr = temp;
        }

        arr[current] = data;
        current++;
    }
  
    void set(int data, int index) {

        if (index == capacity)
            add(data);
        else
            arr[index] = data;
    }

    int get(int index) {

        if (index < current) {
            return arr[index];
        }
        
        return -1;
    }

    void remove() {
        current--;
    }

    int size() {
        return current;
    }
    
    int getcapacity() {
        return capacity;
    }
    
    void print() {
        for (int i = 0; i < current; i++) {
            System.out.print(arr[i] + " ");
        }
        
        System.out.println();
    }
    
	public static void main(String[] args) {
		
		GrowbleIntArray list = new GrowbleIntArray();
		
		for(int i = 0; i<10; i++) {
			list.add(i);
		}
		
		System.out.println(list.getcapacity());
		System.out.println(list.size());
		
		list.print();
		
		list.add(12);
		
		System.out.println(list.size());
		
		list.set(1, 0);
		
		list.print();
		
		list.remove();
		
		list.print();
		
		System.out.println(list.get(9));
	}

}
