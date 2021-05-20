import com.INode;
import com.MyNode;
import com.Stack;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Stacktest {
    @Test
    public void given3NumbersWhenAddedToStackShouldHaveLastAddedNode() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        Stack stack = new Stack();
        stack.push(myFirstNode);
        stack.push(mySecondNode);
        stack.push(myThirdNode);
        stack.printStack();
        INode peak = stack.peak();
        Assertions.assertEquals(myThirdNode,peak);
    }
    @Test
    public void given3NumberInStackWhenPopedShouldMatchWithLastAddedNode() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        Stack stack = new Stack();
        stack.push(myFirstNode);
        stack.push(mySecondNode);
        stack.push(myThirdNode);
        INode pop = stack.pop();
        stack.printStack();
        Assertions.assertEquals(myThirdNode,pop);
    }
}
