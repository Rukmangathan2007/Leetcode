class Solution {
    public int minNumberOfHours(int initialEnergy,int initialExperience,int[] energy,int[] experience) {
        int n=energy.length;
        int ans=0;
        int sumEnergy=0;

        for(int i=0;i<n;i++)
            sumEnergy+=energy[i];

        if(initialEnergy<=sumEnergy)
            ans+=sumEnergy-initialEnergy+1;

        int currExperience=initialExperience;

        for(int i=0;i<n;i++){
            if(currExperience<=experience[i]){
                ans+=experience[i]-currExperience+1;
                currExperience+=experience[i]-currExperience+1;
            }
            currExperience+=experience[i];
        }

        return ans;
    }
}