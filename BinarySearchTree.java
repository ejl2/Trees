
public class BinarySearchTree {
  private TreeNode root;

  public void insert(Integer data) {
    if (root == null) {
      root = new TreeNode(data);
    } else {
      root.insert(data);
    }
  }

  public TreeNode find(Integer data) {
    if (root != null) {
      return root.find(data);
    }

    return null;
  }

  // method for "soft" deletion
  public void delete(Integer data) {
    TreeNode toDel = find(data);
    toDel.delete();
  }

  // finds smallest (left-most) data point
  public Integer minValue() {
    if (root == null) {
      return null;
    }

    TreeNode cur = root;

    while (cur.getLeftChild() != null && !cur.getLeftChild().isDeleted()) {
      cur = cur.getLeftChild();
    }
    return cur.getData();
  }

  // finds the greatest (right-most) data point
  public Integer maxValue() {
    if (root == null) {
      return null;
    }

    TreeNode cur = root;

    while (cur.getRightChild() != null && !cur.getRightChild().isDeleted()) {
      cur = cur.getRightChild();
    }
    return cur.getData();
  }

  // prints all values in post order
  public void inOrder() {
    inOrder(root);
  }

  public void inOrder(TreeNode subTree) {
    if (subTree == null) {
      return;
    } else {
      inOrder(subTree.getLeftChild());
      if (!subTree.isDeleted()) {
        System.out.println(subTree.getData());
      }
      inOrder(subTree.getRightChild());
    }
  }

  public void preOrder() {
    preOrder(root);
  }

  public void preOrder(TreeNode subTree) {
    if (subTree == null) {
      return;
    } else {
      if (!subTree.isDeleted()) {
        System.out.println(subTree.getData());
      }
      preOrder(subTree.getLeftChild());
      preOrder(subTree.getRightChild());
    }
  }


  // public void delete(Integer data) {
  //   TreeNode cur = root;
  //   TreeNode parent = root;
  //   boolean isLeftChild = false;
  //
  //   if (cur == null) {
  //     return;
  //   }
  //
  //   // parent and cur pointers iterate through until cur is pointing
  //   // to the target value (or null), and the parent i spointing to target's parent
  //   while (cur != null && cur.getData() != data) {
  //     parent = current;
  //
  //     if (data < cur.getData()) {
  //       cur = cur.getLeftChild();
  //       isLeftChild = true;
  //     } else {
  //         cur = cur.getRightChild();
  //         isLeftChild = false;
  //     }
  //   }
  //
  //   // data not found
  //   if (cur == null) {
  //     return;
  //   }
  //
  //   // data is found as a leaf
  //   if (cur.getLeftChild == null && cur.getRightChild == null) {
  //     if (cur == root) {
  //       root = null;
  //     } else if (isLeftChild) {
  //       parent.setLeftChild(null);
  //     } else {
  //       parent.setRightChild(null);
  //     }
  //   }
  //
  //   // data is found and HAS only a left child
  //   else if (cur.getRightChild() == null) {
  //     if (cur == root) {
  //       root = cur.getLeftChild();
  //
  //       // data found and IS a left child
  //     } else if (isLeftChild) {
  //       parent.setLeftChild(cur.getLeftChild());
  //
  //       // data found and IS a right child
  //     } else {
  //       parent.setRightChild(cur.getLeftChild());
  //     }
  //   }
  //
  //   // data is found and HAS only a right child
  //   else if (cur.getLeftChild() == null) {
  //     if (cur == root) {
  //       root = cur.getRightChild();
  //
  //       // data found and IS a left child
  //     } else if (isLeftChild) {
  //       parent.setLeftChild(cur.getRightChild());
  //
  //       // data found and IS a right child
  //     } else {
  //       parent.setRightChild(cur.getRightChild());
  //     }
  //   }
  //
  //   // data is found and HAS both children
  //
  //
  //
  //
  // }
}
