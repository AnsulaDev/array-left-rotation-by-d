 class ArrayLeftRotationByD {
    static void leftRotation(int a[],int d,int n){
        reverse(a,0,d-1);
        reverse(a,d,n-1);
        reverse(a,0,n-1);
    }
    static void reverse(int a[],int low,int high){
        while(low<high) {
            int temp = a[low];
            a[low] = a[high];
            a[high] = temp;
            low++;
            high--;
        }
    }
    public static void main(String args[]){
        int a[] ={1,2,3,4,5,6};
        int n =6;
        int d =2;
        System.out.println("before rotation ");
        for(int i=0;i<n;i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
        leftRotation(a,d,n);
        System.out.println("After rotation");
        for(int i=0;i<n;i++){
            System.out.print(a[i] + " ");
        }
    }
}
