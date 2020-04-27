//Question 2
class BinaryTree { 
    count = 0;
    void Count(Node root, int key) { 
          
        /* base case */
        while (root != null) { 
            // pass right subtree as new tree 
            if (key > root.data) 
                root = root.right; 
  
            // pass left subtree as new tree 
            else if (key < root.data) 
                root = root.left; 
          
            else {
                // if the key is found
                //check left subtree
                while(root.left != null){
                  count++;
                  //Check leftsubtree until nil
                  root = root.left;
                //check right subtree
                } else if (root.right != null) {
                  //check right subtree until nil
                  root = root.right;  
                  count++; 
                }
            }
        } 
    } 
