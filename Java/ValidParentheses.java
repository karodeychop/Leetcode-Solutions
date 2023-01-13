class Solution {

    class Stack<T> {
        private ArrayList<T> stack;

        public Stack() {
            this.stack = new ArrayList<T>();
        }

        public T pop() {
            return stack.remove(stack.size() - 1);
        } 

        public void push(T item) {
            stack.add(item);
        }

        public int getSize() {
            return stack.size();
        }
    }
    public boolean isValid(String s) {

        boolean valid = true;
        Stack<Character> parenStack = new Stack<Character>();

        for(int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            
            if(c == '(' || c == '[' || c == '{') {
                parenStack.push(c);
            } else {
                if(parenStack.getSize() != 0) {
                    switch(c) {
                        case ')':
                            if(parenStack.pop() != '(') {
                                valid = false;
                            }
                            break;
                        case ']':
                            if(parenStack.pop() != '[') {
                                valid = false;
                            }
                            break;
                        case '}':
                        if(parenStack.pop() != '{') {
                            valid = false;
                        }
                        break;
                    }
                } else {
                    valid = false;
                }
            }
        }
        if(parenStack.getSize() != 0) {
            valid = false;
        }
        return valid;
    }
}