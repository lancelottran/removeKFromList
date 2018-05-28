// Definition for singly-linked list:
// class ListNode<T> {
//   ListNode(T x) {
//     value = x;
//   }
//   T value;
//   ListNode<T> next;
// }
//

ListNode<Integer> removeKFromList(ListNode<Integer> l, int k) {
    ListNode<Integer> removeKFromList = new ListNode<Integer>(0);
    removeKFromList.next = l;
    ListNode<Integer> temp_node = removeKFromList;
    
    while(temp_node.next != null)
    {
        if(temp_node.next.value == k)
            temp_node.next=temp_node.next.next;
        else
            temp_node=temp_node.next;
    }
    
    return removeKFromList.next;
}
