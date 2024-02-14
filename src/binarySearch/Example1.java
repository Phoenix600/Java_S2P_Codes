package binarySearch;

public class Example1 {


    public static void swap(Integer a, Integer b){
        Integer c = a;
        a = b;
        b = c;
    }
    public static int binarySearch(int A[], int key,int size){
        int high = A.length-1;
        int low = 0;
        int mid;
        while (low<=high){
            mid = (low+high)/2;

            if(A[mid] == key){
                return mid;
            }else if(A[mid] > key){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        Integer a = 12;
        Integer b = 14;
        swap(a,b);
        System.out.println(a + "...." + b);
        int A[] = {44,55,66,77,88,90,100,455};
        int index = binarySearch(A,77,A.length);
        System.out.println(index);
    }
}
