/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n=mountainArr.length() , low=0 , high = n-1,max=0;
        while(low<high){
            int mid = low+(high-low)/2;
            if(mountainArr.get(mid)>mountainArr.get(mid+1)){
                high=mid;
            }else {
                low=mid+1;
            }
        }
        max=low;
        low=0;
        high=max;
        while(low<=high){
            int mid = low+(high-low)/2;
            int val = mountainArr.get(mid);
            if(target<val){
                high=mid-1;
            }else if(target>val){
                low=mid+1;
            }else{
                return mid;
            }
        }
        low=max+1;
        high=n-1;
        while(low<=high){
            int mid= low+(high-low)/2;
            int val2 = mountainArr.get(mid);
            if(target<val2){
                low=mid+1;
            }else if(target>val2){
                high=mid-1;
            }else{
                return mid;
               
            }
        }
        return -1;
    }
}
