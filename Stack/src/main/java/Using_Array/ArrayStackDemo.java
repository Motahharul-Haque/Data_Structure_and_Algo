package Using_Array;

public class ArrayStackDemo {

    public static void main(String[] args) {

        ArrayStack stack = new ArrayStack(10);

        stack.push(new Employee("Jane","Jones", 123 ));
        stack.push(new Employee("John", "Doe", 6749));
        stack.push(new Employee("Mary", "Smith", 22));
        stack.push(new Employee("Mike", "Wilson", 3245));
        stack.push(new Employee("Bill", "End", 78));

        //stack.printStack();
        //System.out.println("Peek Element : "+stack.peek());
        System.out.println(stack.size());
        System.out.println("Element Popped : "+stack.pop());
        System.out.println("Element Popped : "+stack.pop());
        System.out.println(stack.size());
        stack.printStack();
    }
}
