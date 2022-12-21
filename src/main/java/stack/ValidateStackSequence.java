package stack;

import java.util.Stack;

public class ValidateStackSequence {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> sequences = new Stack<>();
        if (pushed.length != popped.length){
            return false;
        }

        int iter_pop = 0;
        for (int iter_push=0;iter_push<pushed.length;iter_push++){
            sequences.push(pushed[iter_push]);
            while (popped[iter_pop] == sequences.peek()){
                sequences.pop();
                iter_pop++;
                if (iter_pop == popped.length || sequences.isEmpty()){
                    break;
                }
            }
        }
        return sequences.isEmpty();
    }
}
