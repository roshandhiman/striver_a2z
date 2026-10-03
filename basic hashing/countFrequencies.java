class Solution {
    public List<List<Integer>> countFrequencies(int[] nums) {
        HashMap<Integer,Integer> a=new HashMap<>();
        // int count=1;
        for(int ab:nums){
            if(!a.containsKey(ab)){
                a.put(ab,1);
            }else{
                int count=a.get(ab);
                count++;
                a.put(ab,count);
            }
        }
        List<List<Integer>> b=new ArrayList<>();
        for(int num : a.keySet()){
            List<Integer>temp=new ArrayList<>();
            temp.add(num);
            temp.add(a.get(num));
            b.add(temp);
        }
        return b;
    }
}