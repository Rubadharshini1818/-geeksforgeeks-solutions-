class Solution {
    public int[] replaceElements(int[] arr) {
        int arr2[] = new int[arr.length];
        
        for(int i = 0; i < arr.length; i++){
            int max = Integer.MIN_VALUE;
            
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] > max){
                    max = arr[j];
                }
            }
            
            if(i == arr.length - 1){
                arr2[i] = -1;
            } else {
                arr2[i] = max;
            }
        }
        
        return arr2;
    }
}
