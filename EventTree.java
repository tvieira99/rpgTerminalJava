import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/**
  * @author ycoppel@google.com (Yohann Coppel)
  * 
  * @param <T>
  *          Object's type in the tree.
*/

public class EventTree<T> {

  private T head;

  private ArrayList<EventTree<T> > leafs = new ArrayList<EventTree<T>>();

  private EventTree<T> parent = null;

  private HashMap<T, EventTree<T> > locate = new HashMap<T, EventTree<T>>();

  public EventTree(T head){
    this.head = head;
    locate.put(head, this);
  }

  public void addLeaf(T root, T leaf){
    if (locate.containsKey(root)) {
      locate.get(root).addLeaf(leaf);
    } else {
      addLeaf(root).addLeaf(leaf);
    }
  }

  public EventTree<T> addLeaf(T leaf) {
    EventTree<T> t = new EventTree<T>(leaf);
    leafs.add(t);
    t.parent = this;
    t.locate = this.locate;
    locate.put(leaf, t);
    return t;
  }

  public EventTree<T> setAsParent(T parentRoot) {
    EventTree<T> t = new EventTree<T>(parentRoot);
    t.leafs.add(this);
    this.parent = t;
    t.locate = this.locate;
    t.locate.put(head, this);
    t.locate.put(parentRoot, t);
    return t;
  }

  public T getHead() {
    return head;
  }

  public EventTree<T> getTree(T element) {
    return locate.get(element);
  }

  public EventTree<T> getParent() {
    return parent;
  }

  public Collection<T> getSuccessors(T root) {
    Collection<T> successors = new ArrayList<T>();
    EventTree<T> tree = getTree(root);
    if (null != tree) {
      for (EventTree<T> leaf : tree.leafs) {
        successors.add(leaf.head);
      }
    }
    return successors;
  }

  public Collection<EventTree<T>> getSubTrees() {
    return leafs;
  }

  public static <T> Collection<T> getSuccessors(T of, Collection<EventTree<T>> in) {
    for (EventTree<T> tree : in) {
      if (tree.locate.containsKey(of)) {
        return tree.getSuccessors(of);
      }
    }
    return new ArrayList<T>();
  }

  @Override
  public String toString() {
    return printTree(0);
  }

  private static final int indent = 2;

  private String printTree(int increment) {
    String s = "";
    String inc = "";
    for (int i = 0; i < increment; ++i) {
      inc = inc + " ";
    }
    s = inc + head;
    for (EventTree<T> child : leafs) {
      s += "\n" + child.printTree(increment + indent);
    }
    return s;
  }
}