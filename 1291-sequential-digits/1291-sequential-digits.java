class Solution {
    public int sub(int[] arr,int st){
        int res=0;
        for(int i=st;i>=0;i--){
            res=(res*10)+arr[i];
        }
        return res;
    }
    public void build(List<Integer> lt){
        int arr[] = new int[9];
        arr[0]=2;
        arr[1]=1;
        int N=2;
        lt.add(sub(arr,N-1));
        while(N<9){
            if(arr[0]!=9){
                for(int i=N-1;i>=0;i--){
                    arr[i]++;
                }
                lt.add(sub(arr,N-1));
            }
            else{
                N++;
                int val=1;
                for(int i=N-1;i>=0;i--){
                    arr[i]=val++;
                }
                lt.add(sub(arr,N-1));
            }
        }



    }
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> lt=new ArrayList<>();
        List<Integer> res=new ArrayList<>();
        build(lt);
        int idx=0;
        while(idx<lt.size() && lt.get(idx)<low){
            idx++;
        }
        while(idx<lt.size() && lt.get(idx)<=high){
            res.add(lt.get(idx));
            idx++;
        }
        return res;

    }
}