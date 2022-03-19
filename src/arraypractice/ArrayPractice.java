package arraypractice;

import java.util.Currency;

import javax.naming.InitialContext;

public class ArrayPractice {
  /* sets every item in A[] to initialValue */
  public static void initialize(int A[], int initialValue) {
    for (int i =0; i< A.length;i++){
      A[i]= initialValue;
    }
    return;
  }

  /* returns the average of the items in A
   * Be careful: A[] is an array of int and the method returns
   * double. What do we do to handle this? */
  public static double average(int A[]) {
    double Av = 0.0;
    for(int i= 0; i<A.length; i++){
      Av+= A[i];
    }
    Av = Av/(A.length);
    return Av;
  }

  /* returns the number of times that x appears in A[] */
  public static int numOccurrences(int A[], int x) {
    int NumOfOccur = 0;
    for(int i=0; i< A.length;i++){
        if (A[i] == x){
          NumOfOccur++;
        }
    }
    return NumOfOccur;
  }


  /* returns the index of the first occurrence of
   * x in A[] or -1 if x doesn't exist in A[] */
  public static int find(int A[], int x) {
    for (int i=0;i< A.length ; i++){
        if (A[i] == x){
          return i;
        }
    }
    return -1;
  }

  /* Returns the index of the first occurrence of
   * item within the first n elements of A[] or -1
   * if item is not among the first n elements of A[] */
  public static int findN(int A[], int item, int n) {
    for (int i = 0; i< n; i++){
      if (A[i] == item){
        return i;
      }
    }
    return -1;
  }

  /* returns the index of the last occurrence of
   * x in A[] or -1 if x doesn't exist in A[] */
  public static int findLast(int A[], int x) {
    for (int i = A.length-1;i>= 0; i--){
        if (A[i] == x){
          return i;
        }
    }
    return -1;
  }

  /* returns the largest item found in A */
  public static int largest(int A[]) {
    int Greatest_Int =A[0] ;
      for (int i=0 ; i<A.length ; i++){
          if (Greatest_Int <A[i]){
            Greatest_Int = A[i];
          }
      }  
     return Greatest_Int;
}
  /* returns the index of the largest item found in A */
  public static int indexOfLargest(int A[]) {
    int GrT_Val =0; 
    for (int i = 0; i<A.length; i++){
       if(A[GrT_Val] < A[i]){
         GrT_Val = i;
       }
     } 
   return GrT_Val;
 }

  /* returns the index of the largest odd number
   * in A[] or -1 if A[] contains no odd numbers */
  public static int indexOfLargestOdd(int A[]) {
    int Odd_Greatest = 0;
    int Num_Odd = 0;
    for (int i =0; i <A.length; i++){
      if (A[i]% 2 != 0){
        Num_Odd ++;
        if (A[Odd_Greatest] <A [i]){
        Odd_Greatest = i;
        }
    }
  }
    if (Num_Odd == 0 || Odd_Greatest % 2 == 0){
      return -1;
    }
    return Odd_Greatest;
  }
  /* inserts n into A[] at A[index] shifting all */
  /*  the previous items one place to the right. For example */
  /*  if A is  */
  /*   |---+---+---+---+---+---+---+---+---+---| */
  /*   | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | */
  /*   |---+---+---+---+---+---+---+---+---+---| */
  /*   | 5 | 7 | 6 | 9 | 4 | 3 | 0 | 0 | 0 | 0 | */
  /*   |---+---+---+---+---+---+---+---+---+---| */

  /*   and we call insert(A, 15, 1), A then becomes */

  /*   |---+----+---+---+---+---+---+---+---+---| */
  /*   | 0 |  1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | */
  /*   |---+----+---+---+---+---+---+---+---+---| */
  /*   | 5 | 15 | 7 | 6 | 9 | 4 | 3 | 0 | 0 | 0 | */
  /*   |---+----+---+---+---+---+---+---+---+---| */
  /*  the element in A[] that's in the right-most */
  /*    position is removed.                      */
  /*                                              */
  /*  if index < 0 or index >= A.length-1, the method */
  /*                                    does nothing */
  public static void insert(int A[], int n, int index) {
    boolean lol = true;
    if (index < 0 || index >= A.length-1){
    lol = false;   
    }
    if( lol = true){
    for (int i =0 ; i <A.length; i++){  

      if (i < index){
        A[i] = A[i];
      }
      if (index < i){
        A[i] = A[i+1];
      }
    A[index] =n;
    }
  }
    return;
  }

  /* returns a new array consisting of all of the
   * elements of A[] */
  public static int[] copy(int A[]) {
    int []CopyOfArray = new int [A.length];
    for(int i = 0; i < A.length; i++){
      CopyOfArray[i] = A[i];
    }
    return CopyOfArray;
  }

  /* Returns a new array consisting of all of the
     first n elements of A[]. If n>A.length, returns a
     new array of size n, with the first A.length elements
     exactly the same as A, and the remaining n-A.length elements
     set to 0. If n<=0, returns null. */
  public static int[] copyN(int A[], int n) {
    int []CopyOfArray = new int [n];
    if (n <=0){
      return null;
    }
    if (n > A.length){
    for (int i = 0; i< n ;i++){
      CopyOfArray[i]= A[i];
    }
    return CopyOfArray;
    }
    for (int i = 0; i< n ;i++){
      CopyOfArray[i]= A[i];
    }
    return CopyOfArray;
    
}

  /* returns a new array consisting of all of the
   * elements of A[] followed by all of the
   * elements of B[]. For example, if 
   A[] is: {10,20,30} and 
   B[] is: {5, 9, 38}, the method returns the
   array : {10,20,30,5,9,38} */
  public static int[] copyAll(int A[], int B[]) {
    int []CopyOfArray= new int [A.length+B.length];
    for (int i = 0; i< (A.length);i++){
      if (i <=A.length){
        CopyOfArray[i]= A[i];
      }
    if (i > A.length){
      for (int n =0;n<B.length;n++){
      CopyOfArray[i] = B[n];
      }
    } 
}
return CopyOfArray;
  }
  /* reverses the order of the elements in A[].
   * For example, if A[] is:
   {10,20,30,40,50}, after the method, A[] would
   be {50,40,30,20,10} */
  public static void reverse(int A[]) {
    int []Copy = new int[A.length];
    for (int i = A.length-1 ; i> 0 ;i--){
      Copy[A.length-i] =A[i];
    }
    A=Copy;
  } 

  /* Extra credit:
   *
   * Returns a new array consisting of all of the
   * elements of A, but with no duplicates. For example,
   * if A[] is {10,20,5,32,5,10,9,32,8}, the method returns
   * the array {10,20,5,32,9,8} */
  public static int[] uniques(int A[]) {
    return null;
  }

  public static void main(String[] args) {
    return;
  }
}
