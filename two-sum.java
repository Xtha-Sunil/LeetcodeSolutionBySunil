class Solution {
    public int[] twoSum(int[] a, int target) {
      Map<Integer, Integer> map = new HashMap<>();
      for(int i=0; i<a.length; i++){
      	if(map.containsKey(target-a[i])){
        	return new int[] {map.get(target-a[i]),i};
      	}
        map.put(a[i],i);
    	}
      
      throw new IllegalArgumentException();
  }
}

/*
Question : 
In this we are given an array and a target number. Our task is to find 
any two number in array whose sum is equal to target and return the index of those numbers.
We are givem that there exist only one solution.

Approach :
- Made map that stores number and its index.
- Loop the array
- Calculate the complement of each element and check weather the complement is present or not in map.
- When complement is found return (index, i)
- As the return statement is inside loop due to givem condition that one solution exist, we throw error at last for error handeling. 
*/
