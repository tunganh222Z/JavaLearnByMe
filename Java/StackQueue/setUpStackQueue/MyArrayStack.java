package StackQueue;

public class MyArrayStack implements IStackQueue{
    private int[] array;
    private int size;
    private int topIndex;

    MyArrayStack (int size){
        this.size = size;
        array = new int[this.size];
        this.topIndex = -1; // Khi array đang rỗng thì -1
    }

    @Override
    public boolean push(int value) {
        if (!isFull()){
            topIndex++;
            array[topIndex] = value;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int pop() {
        if (!isEmpty()){
            int value = array[topIndex];
            topIndex--;
            return value;
        }
        return -1;
    }

    @Override
    public boolean isFull() {
        return topIndex == this.size -1;
    }

    @Override
    public boolean isEmpty() {
        return topIndex < 0;
    }
}
