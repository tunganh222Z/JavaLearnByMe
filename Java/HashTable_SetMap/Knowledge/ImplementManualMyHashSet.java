package HashTable_SetMap.Knowledge;

import java.util.ArrayList;

public class ImplementManualMyHashSet {
    public static void main(String[] args) {
        ImplementManualMyHashSet mySet = new ImplementManualMyHashSet();

        mySet.add(1);
        mySet.add(2);
        mySet.add(1);
    }
    private final int size = 1000;
    private ArrayList<Integer> myBucket[];

    ImplementManualMyHashSet(){
        myBucket = new ArrayList[size];
        for (int i =0; i < myBucket.length; i++){
            myBucket[i] = new ArrayList<>();
        }
    }

    //return hashValue
    private int hashFunction(int key){
        return key % size;
    }

    private void add(int key){
        int hasValueIndex = hashFunction(key);

        ArrayList<Integer> bucket = myBucket[hasValueIndex];

        int keyIndex = bucket.indexOf(key);

        if (keyIndex < 0){
            bucket.add(keyIndex);
        }
    }

    private void remove (int key){
        int hasValueIndex = hashFunction(key);
        var bucket = myBucket[hasValueIndex];
        bucket.remove(key);
    }
}
