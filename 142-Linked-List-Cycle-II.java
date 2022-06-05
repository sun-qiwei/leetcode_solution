// slow  and fast meet at  k
// slow = k fask = 2k. k is a loop
// let loop point at m
// the k-m is the distance betweent meet point and loop point
// k-(k-m) is the distane betweent meet point and loop point
// start point to loop point is m
// then when a pointer walk from start will meet the pointer walk from the meet point at loop point

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode ahead = head;
        ListNode later = head;
        if(ahead==null||ahead.next==null){
            return null;
        }
        while(ahead!=null){
            
            later = later.next;
           
            if(ahead.next!=null){
                ahead=ahead.next.next;
            }
            else {
                return null;
            }
            
            if(later==ahead){
                while(head!=later){
                    head=head.next;
                    later=later.next;
                }
             return later;
            }
            
             
        }
       return null;
    }
        
}
    
// public class Solution {
//     public ListNode detectCycle(ListNode head) {
//         HashMap<ListNode,Integer> map = new HashMap();
//         int count = 0;
//         while(head!=null){
//             count++;
//             if(map.containsKey(head)){
               
//                 return head;
//             }
//             map.put(head,count);
//             head=head.next;
            
//         }
        
//          return head;
//     }
// }
    
