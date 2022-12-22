package stack;

import java.util.ArrayList;
import java.util.List;

public class BuildArrayWithStackOperations {
    public List<String> buildArray(int[] target, int n) {
        List<String> result = new ArrayList<String>();
        int iter_target = 0;
        int counter = 1;
        // have to push counter but if counter!=target[iter_target]: have to do a pop
        while(iter_target<target.length && counter<=n){
            if (target[iter_target]!=counter){
                result.add("Push");
                result.add("Pop");
                counter++;
            }else{
                result.add("Push");
                iter_target++;
                counter++;
            }
        }
        return result;

    }
}
