//https://leetcode.com/problems/merge-two-sorted-lists/

public class MergeSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null){
            return list2;
        }
        if(list2==null){
            return list1;
        }
        ListNode list3=new ListNode();
        ListNode head=list3;
        
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                
                list3.val=list1.val;
                list1=list1.next;
            }
            else{
                list3.val=list2.val;
                list2=list2.next;
            }
            
            if(list1!=null && list2!=null){
                list3.next=new ListNode();
                list3=list3.next;
            }
            
        }
        if(list1==null){
            list3.next=list2;
        }
        if(list2==null){
            list3.next=list1;
        }
        return head;

}
    public static void main(String[] args) {
        MergeSortedLists m=new MergeSortedLists();
        ListNode list1=new ListNode(1);
        ListNode list2=new ListNode(1);
        System.out.println(m.mergeTwoLists(list1, list2));
    }
}
