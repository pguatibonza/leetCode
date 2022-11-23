public class findMedianSortedArrays {
    public double findMedianSortedArrays(int[] nums1,int[]nums2){
        int index1=0;
        int index2=0;
        int index=0;
        int total=nums1.length+nums2.length;
        int[] nums=new int[total];
        while(index1+index2 < total ){
            if (index1<nums1.length && index2<nums2.length ){
                if (nums1[index1]<nums2[index2]){
                    nums[index]=nums1[index1];
                    index1+=1;
                }
                else{
                    nums[index]=nums2[index2];
                    index2+=1;
                }

            }
            else if (index1>=nums1.length){
                nums[index]=nums2[index2];
                index2++;
            }
            else{
                nums[index]=nums1[index1];
                index1++;
            }

            
            
            index+=1;
        }
        if(total%2==0){
            double suma=nums[total/2]+nums[total/2 -1];
            return suma/2;
        }
        else{
            return nums[(total-1)/2];
        }
    }
    public static void main(String[] args) {
        findMedianSortedArrays f=new findMedianSortedArrays();
        int[] nums1={1,3};
        int[] nums2={2};
        System.out.println(f.findMedianSortedArrays(nums1, nums2));
    }
}
