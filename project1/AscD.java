class AscD{
    static void method(int[] a,int b){
        int temp;
        for(int i=0;i<b;i++){
            for(int j=0;j<b/2;j++){
                if(a[j]>a[j+1]){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
            for(int j=b/2;j<b;j++){
                if(a[j]<a[j+1]){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        for(int i=0;i<b;i++){
            System.out.println(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        int [] arr = {2,10,4,20,30,5};
        int n = arr.length;
        method(arr, n);
    }
}