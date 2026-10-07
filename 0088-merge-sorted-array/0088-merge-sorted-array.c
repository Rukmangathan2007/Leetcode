void merge(int* a, int nums1Size, int m, int* b, int nums2Size, int n) {
    int i=0,j=0;
    while(i < m && j < n){
        if(a[i]>b[j]){
            for(int k=m;k>i;k--)a[k]=a[k-1];
            a[i]=b[j];
            m++;
            j++;
        }
        i++;
    }
    while (j < n) {
        a[m++] = b[j++];
    }
}