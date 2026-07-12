class Solution{
    public int[] arrayRankTransform(int[] arr){
        int[] a=arr.clone();
        Arrays.sort(a);
        int m=0;
        for(int x:a){
            if(m==0||a[m-1]!=x){
                a[m]=x;
                m++;
            }
        }
        int[] b=Arrays.copyOf(a,m);

        for(int i=0;i<arr.length;i++){
            arr[i]=Arrays.binarySearch(b,arr[i])+1;
        }


        return arr;
    }
}