package StackQueue.SetUpStackQueue;

public class MyQueueArray implements IStackQueue{

    private int[] array;
    private int size;
    private int headIndex;
    private int tailIndex;

    MyQueueArray(int size){
        this.size = size;
        this.array = new int[size];
        headIndex = -1;
        tailIndex = -1;
    }

    @Override
    public boolean push(int value) {
        if (!isFull()){
            if (isEmpty()){
                headIndex++;
            }
            tailIndex++;
            array[tailIndex] = value;
            return true;
        }
        return false;
    }

    @Override
    public int pop() {
        int value = -1;
        if (!isEmpty()){
            value = array[headIndex];
            headIndex++;
            if (headIndex > tailIndex){
                headIndex = tailIndex = -1; // list tro thanh empty
            }

        }

        return value;
    }

    public int count (){
        if (isEmpty()){
            return 0;
        } else {
            return tailIndex - headIndex + 1;
        }
    }

    @Override
    public boolean isFull() {
        return tailIndex == size - 1;
    }

    @Override
    public boolean isEmpty() {
        return headIndex == -1 && tailIndex == -1;
    }

    @Override
    public void print() {
        if (isEmpty()){
            System.out.println("Queue is empty");
        } else {
            for (int i = headIndex; i <= tailIndex; i++){
                System.out.print( array[i] + " ");
            }
            System.out.println();
        }
    }
}
