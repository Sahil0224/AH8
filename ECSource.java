class Node<T> {
  T val;
  Node<T> next;
  
  public Node(T val) {
    this.val = val;
    this.next = null;
  }
}

class ECSource {
  public static <T> T getNodeValue(Node<T> head, int index) {
    // todo - note the return type, but don't overthink it

    // if head is null return null
    if (head == null)
    {
      return null;
    }

    // initialize a counter to keep track of current index
    int count = 0;

    // loop until the end of the list or till the index is reached
    while (head != null && count < index)
    {
      // move the pointer to the next node
      head = head.next;

      // increment the counter
      count++;
    }

    // if the pointer is not null, return the value of the node
    if(head != null)
    {
      return head.val;
    }
    return null;
  }
  
  public static void main(String[] args) {
    Node<String> node1 = new Node<>("banana");
    Node<String> node2 = new Node<>("mango");
    Node<String> node3 = new Node<>("kiwi");

    node1.next = node2;
    node2.next = node3;

    // banana -> mango -> kiwi

    System.out.println(ECSource.getNodeValue(node1, 1));
  }
}