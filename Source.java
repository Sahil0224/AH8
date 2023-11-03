class Node<T> {
    T val;
    Node<T> next;
    
    public Node(T val) {
      this.val = val;
      this.next = null;
    }
  }
  
  class Source {
    public static <T> boolean linkedListFind(Node<T> head, T target) {
      // todo

    // while the head is not null
    while(head != null)
    {
      // check if head's value equals to the target, if it is then return true
      if(head.val.equals(target))
      {
        return true;
      }
      // call the method on the next node
      head = head.next;
    }
    // otherwsie return false
      return false;
    }
    
    public static void main(String[] args) {
        Node<String> a = new Node<>("a");
        Node<String> b = new Node<>("b");
        Node<String> c = new Node<>("c");
        Node<String> d = new Node<>("d");

        a.next = b;
        b.next = c;
        c.next = d;

        // a -> b -> c -> d

        System.out.println(Source.linkedListFind(a, "c"));

        Node<Integer> node1 = new Node<>(42);
        System.out.println(Source.linkedListFind(node1, 100));
        
    }

  }