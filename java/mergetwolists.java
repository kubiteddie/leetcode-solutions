class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();
        ListNode trackMerge = dummy;
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                dummy.next = new ListNode(list1.val);
                list1 = list1.next;
                dummy = dummy.next;
            }
            else if(list2.val <= list1.val){
                dummy.next = new ListNode(list2.val);
                list2 = list2.next;
                dummy = dummy.next;
            }
        }
        dummy.next = list1 == null ? list2 : list1;
        return trackMerge.next;
    }
}
