package queue;

public class MyCircularQueue {

    private int[] queue;
    private int front;
    private int back;
    private int size;
    private int numberOfElements;

    public MyCircularQueue(int k) {
        queue = new int[k];
        front = 0;
        back = 0;
        size = k;
        numberOfElements = 0;
    }

    public boolean enQueue(int value) {
        if (numberOfElements<size){
            queue[back] = value;
            back++;
            numberOfElements++;
            back = back % size;
            return true;
        }
        return false;
    }

    public boolean deQueue() {
        if (numberOfElements>0){
            front++;
            numberOfElements--;
            front = front % size;
            return true;
        }
        return false;
    }

    public int Front() {
        if (!isEmpty()){
            return queue[Math.floorMod(front,size)];
        }
        else{
            return -1;
        }

    }

    public int Rear() {
        if (!isEmpty()){
            return queue[Math.floorMod(back-1,size)];
        }
        return -1;
    }

    public boolean isEmpty() {
        return numberOfElements==0;
    }

    public boolean isFull() {
        return numberOfElements>=size;
    }


}