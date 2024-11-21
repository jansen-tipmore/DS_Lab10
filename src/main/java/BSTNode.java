import java.lang.Comparable;
import java.util.function.Consumer;


/**
   This is a smart Node that utilizes generics.
   Note how we ensured that the type T will always be comparable...

 */
public class BSTNode<T extends Comparable<T>>
{

   private T val;
   private BSTNode<T> left;
   private BSTNode<T> right;
   private int acc = 0;
   


   public BSTNode(T val)
   {
      this(val,null,null);
      
   }
    

   public BSTNode(T val, BSTNode<T> l,BSTNode<T> r)
   {
	   this.val = val;
	   this.left = l;
	   this.right = r;
   }



   /*
     Uses recursion to insert the target into the tree
    */
   public void insert(T target)
   {
	   if(this.val == target) {
		   return;
	   }
	   if(this.val.compareTo(target) > 0) {
		   if(this.left == null) {
			   BSTNode<T> newnode = new BSTNode<T>(target, null, null);
			   this.left = newnode;
		   }
		   this.left.insert(target);
	   }
	   if(this.val.compareTo(target) < 0) {
		   if(this.right == null) {
			   BSTNode<T> newnode = new BSTNode<T>(target, null, null);
			   this.right = newnode;
		   }
		   this.right.insert(target);  
	   }
}


   /*
     Uses recursion to retrieved the value target from the tree.  
     Returns null if it can't find the value.
    */
   public T retrieve(T target)
   {
	if(this.val == target) {
		return target;
	}
	if(this.val.compareTo(target) > 0) {
		this.left.retrieve(target);
	}
	else {
		this.right.retrieve(target);
	}
	return null;
   }


    /**
       If it is present, what level is the node?
       If it is not present, what level would it be placed.
     */
   public int retrieveDepth(T target)
   {
	if(this.val == target) {
		return acc;
	}
	if(this.val.compareTo(target) > 0) {
		acc++;
		this.left.retrieveDepth(target);
	}
	else {
		acc++;
		this.right.retrieveDepth(target);
	}
	return acc;
   }

   /**
      Uses recursion to return the largest value in the tree
    */
   public T getLargest()
   {
	if(this.right == null) {
		return this.val;
	}
	else {
		return this.right.getLargest();
	}
   }


   /**
      Uses recursion to do an inorder traversals.
      consume is part of a strategy pattern, to determine what the
      "Visit" should be.

    */
   public void inOrderTraversal(Consumer<T> consume)
   {
	   if(this.left == null) {
		   consume.accept(this.val);
		   this.right.inOrderTraversal(consume);
	   }
	   if(this.left != null) {
		   this.left.inOrderTraversal(consume);
	   }

   }


   /**
      returns true if this tree is equal to that tree.
      false otherwise.

      Note: While I must always be non-null.  
            Nothing prevents "that" from being null.
	    
	    This one is long!
    */
   public boolean myEquals(BSTNode<T> that)
   {
	return false;
   

   }

}
