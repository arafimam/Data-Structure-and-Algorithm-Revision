package stack;

public class DesignStackWithIncrementOperation {

    static class CustomStack {

        private int[] array_stack;
        private int pointerToTopOfStack = 0;
        private final int max;

        public CustomStack(int maxSize) {
            this.array_stack = new int[maxSize];
            this.max =  maxSize;
        }

        public void push(int x) {
            if (pointerToTopOfStack < max){
                array_stack[pointerToTopOfStack] = x;
                pointerToTopOfStack++;
            }
        }

        public int pop() {
            if (pointerToTopOfStack == 0){
                return -1;
            }
            else{
                pointerToTopOfStack--;
                int result = array_stack[pointerToTopOfStack];
                return result;
            }
        }

        public void increment(int k, int val) {
            for (int i=0;i<k && i<max;i++){
                array_stack[i] = array_stack[i]+val;
            }
        }
    }
}
