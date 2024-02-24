public class Node {
  int key;
  Node left, right;
  public Node(int key) {
    this(key, null, null);
  }
  public Node(int key, Node left, Node right) {
      this.key = key;
      this.left = left;
      this.right = right;
  }
  public void accept(Visitor v) {
      v.visitNode(this);
  }
  public void insert(int num) {
    if (this.find(num)) return;
    else if (num < this.key) {
      if (this.left != null) {
        this.left.insert(num);
      } else {
        this.left = new Node(num);
      }
    } else { // it's on the right
      if (this.right != null) {
        this.right.insert(num);
      } else {
        this.right = new Node(num);
      }
    }
  }

  public void delete(int num){
    //Does the number exist?
    if(!this.find(num)){
      return;
    }

    //Find the number's parent
    Node parent = this.findParent(this, num);

    //Handle the case where the target node is the root
    if(parent == null){
      Node toDelete = this;
      if(toDelete.right == null && toDelete.left == null){
        //Later Michael problem
      }
      Node toSwap = findLeftMost(toDelete.right);
      toDelete.key = toSwap.key;
    
      right.delete(toSwap.key);
      return;
    }

    //Make reference of the child nodes
      //These may not exist
    Node toDelete = null;
    if(num < parent.key){
      toDelete = parent.left;
    } else {
      toDelete = parent.right;
    }

    Node leftNode = toDelete.left;
    Node rightNode = toDelete.right;

    //Does the right node not exist
      //If it doesn't exist, make the child node promoted
    if(rightNode == null){
      if(num < parent.key){
        parent.left = leftNode;
      } else {
        parent.right = leftNode;
      }

      return;
    }

    //Take the right node and promote it
    if(num < parent.key){ //Left tree of parent
      parent.left = rightNode;
    } else { //Rigth tree of parent
      parent.right = rightNode;
    }
    
    //Find the far left node within the original right node
    //Set the original left node as it's left child
    Node farLeft = findLeftMost(rightNode);
    farLeft.left = leftNode;
  }

  public Node findLeftMost(Node node){
    if(node.left == null) return node;
    return findLeftMost(node.left);
  }

  public Node findParent(Node currentNode, int num){
    if(!find(num) || currentNode.key == num) return null;

    System.out.println("On " + currentNode.key);
    if(currentNode.key > num) { //exists in the left
      if(currentNode.left.key == num)
        return currentNode;

      return findParent(currentNode.left, num);
    } else { //exists in the right
      if(currentNode.right.key == num)
        return currentNode;

      return findParent(currentNode.right, num);
    }
  }
  
  public boolean find(int anything) {
    if (anything == this.key) return true;
    else if (anything > this.key)
      if (this.right != null) return this.right.find(anything); else return false;
    else if (this.left != null) return this.left.find(anything); else return false;
  }
}