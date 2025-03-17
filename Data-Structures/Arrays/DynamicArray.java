public class DynamicArray{
    // instance variables initiated in the constructor
    private int[] data;
    private int size;
    private int capacity;

    public DynamicArray(){
        this.capacity = 10;
        this.size = 0;
        this.data = new int[capacity];
    }

    public DynamicArray(int capacity){
        this.capacity = capacity;
        this.data = new int[capacity];
        this.size = 0;
    }

    public void add(int element){
        if(size == capacity){
            resize();
        }
        data[size] = element;
        size++; 
    }

    public int get(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return data[index];
    }

    public void set(int index, int element){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        data[index] = element;
    }

    public void remove(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        for(int i = index;i<size-1;i++){
            data[index] = data[index+1];
        }
        size--;
    }

    public int size(){
        return size;
    }

    public int capacity(){
        return capacity;
    }

    public void resize(){
        capacity *= 2;
        data = Arrays.copyOf(data, capacity);
    }


}