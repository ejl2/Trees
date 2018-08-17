public class TreeNode {
  private Integer data;
  private TreeNode leftChild;
  private TreeNode rightChild;
  private Boolean isDeleted = false;

  // constructs a tree node object out of the data provided
  public TreeNode(Integer data) {
    this.data = data;
  }

  // a recursive method that returns either itself, one of its children, or a null value
  // if the value is not in the tree yet
  public TreeNode find(Integer data) {
    // if the searched data is in the node, return itself
    if (data == this.data && !isDeleted) {
      return this;

      // if the data seeked is less than the current node, call find on left child if it exists
    } else if (data < this.data && leftChild != null) {
      return leftChild.find(data);

      // if the data seeked is less than the current node, call find on the right child if it exists
    } else if (rightChild != null) {
      return rightChild.find(data);

      // returns null if data is not in the tree
    } else {
      return null;
    }
  }

  public void insert(Integer data) {
    if (data < this.data) {
      if (this.leftChild == null) {
          leftChild = new TreeNode(data);
      } else {
        leftChild.insert(data);
      }
    } else {
        if (this.rightChild == null) {
          rightChild = new TreeNode(data);
      } else {
        rightChild.insert(data);
      }
    }
  }


  public Integer getData() {
    return data;
  }

  public void setLeftChild(TreeNode leftChild) {
    this.leftChild = leftChild;
  }

  public void setRightChild(TreeNode rightChild) {
    this.rightChild = rightChild;
  }

  public TreeNode getLeftChild() {
    return leftChild;
  }

  public TreeNode getRightChild() {
    return rightChild;
  }

  public void delete() {
    isDeleted = true;
  }

  public boolean isDeleted() {
    return isDeleted;
  }
}
