class Solution {
    HashMap<Integer,Integer> map=new HashMap<>();
    Set<List<Integer>> list=new HashSet<>();


    public void twoSum(int[] nums, int target,int ind) {
        map.put(nums[ind],map.get(nums[ind])-1);
        for(int i:map.keySet()){
            if(map.get(i)<=0)continue;
            map.put(i,map.get(i)-1);
            if(map.containsKey(target-i) && map.get(target-i)>0){
                int[] temp={nums[ind],i,target-i};
                Arrays.sort(temp);
                list.add(new ArrayList<>(Arrays.asList(temp[0],temp[1],temp[2])));
            }
            map.put(i,map.get(i)+1);
        }
        map.put(nums[ind],map.get(nums[ind])+1);
        
    }

    
    public List<List<Integer>> threeSum(int[] nums) {
        
        int N=nums.length;
        for(int i=0;i<N;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int i=0;i<N;i++){
            twoSum(nums,-1*nums[i],i);
        }
        return new ArrayList<>(list);
    }
}