package stack;

import java.util.Stack;

public class DesignBrowserHistory {

    static class BrowserHistory {

        private Stack<String> pages;
        private Stack<String> history;

        public BrowserHistory(String homepage) {
            this.pages = new Stack<>();
            this.history = new Stack<>();
            pages.push(homepage);
        }

        public void visit(String url) {
            pages.push(url);
            while (!history.isEmpty()){
                history.pop();
            }
        }

        public String back(int steps) {
            int count = 0;
            while (count<steps && pages.size()>1){
                count++;
                history.push(pages.pop());
            }
            return pages.peek();
        }

        public String forward(int steps) {
            int count = 0;
            while (count<steps && !history.isEmpty()){
                count++;
                pages.push(history.pop());
            }
            return pages.peek();
        }
    }

}
