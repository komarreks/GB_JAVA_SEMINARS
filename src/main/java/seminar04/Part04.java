package seminar04;

public class Part04 {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("stack size: " + stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
