package linkedListsTest;

import implementations.linkedList.Node;
import implementations.linkedList.SinglyLinkedList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class LinkedListTest {
    private SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
    @Test
    public void testThatLinkedListExists(){
        assertNotNull(singlyLinkedList);
    }
    @Test
    public void testThatSinglyLinkedListHasHead(){
        Node<Integer> node = singlyLinkedList.getHead();
        assertNull(node);
    }
    @Test
    public void testThatSinglyLinkedListHasTail(){
        Node<Integer> node = singlyLinkedList.getTail();
        assertNull(node);
    }

    @Test
    public void testThatNodeHasElementAndNext(){
        Node <Integer> node = new Node<>(10, null);
        assertEquals(10, node.getData());
        assertNull(node.getNext());
    }

    @Test
    public void testThatElementsCanBeAddedToLinkedList(){

    }

}
