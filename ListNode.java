
 //Definition for singly-linked list.
  public class ListNode{
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution{
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode node = new ListNode(0);
        ListNode head = node;
        while(l1!=null && l2!=null){
            
            if(l2.val<l1.val){
                node.next = l2;
                l2 = l2.next;
            }else{
                node.next = l1;
                l1 = l1.next;
            }
            
            
            node = node.next;
            node.next=null;
            
        }
        
        if(l1==null){
            node.next = l2;
        }else{
            node.next = l1;
        }
        
        return head.next;
        
    }
}