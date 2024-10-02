package LeetCode.NodeSum_Medium;

public class Solution {
    //-->> Solução copiada <<--
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(1);

        ListNode l2 = new ListNode(4);
        l2.next = new ListNode(5);
        l2.next.next = new ListNode(2);


        ListNode a = addTwoNumbers(l1,l2);
        System.out.println(a.val);
        System.out.println(a.next.val);
        System.out.println(a.next.next.val);
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head1 = l1;
        ListNode head2 = l2;
        int carry = 0;
        ListNode curr = new ListNode();
        ListNode head = curr;
        while(head1!=null||head2!=null||carry==1){
            if(head1==null&&head2==null){
                curr.val = 1;
                return head;
                
            }
            if(head1==null){
                int temp = carry+head2.val;
                carry = temp/10;
                temp = temp%10;
                head2 = head2.next;
                curr.val = temp;
                if(carry==0&&head1==null&&head2==null) return head;
                curr.next = new ListNode();
                curr = curr.next;
                continue;
            }
            if(head2==null){
                int temp = carry+head1.val;
                carry = temp/10;
                temp = temp%10;
                head1 = head1.next;
                curr.val = temp;
                if(carry==0&&head1==null&&head2==null) return head;
                curr.next = new ListNode();
                curr = curr.next;
                continue;
            }
            System.out.println(carry +" "+ head1.val +" "+  head2.val);
            int temp = carry+head1.val+head2.val;
            System.out.println(temp);
            carry = temp/10;
            System.out.println(carry);
            temp%=10;
            System.out.println(temp);
            head1 = head1.next;
            head2 = head2.next;
            curr.val = temp;
            if(carry==0&&head1==null&&head2==null) return head;
            curr.next = new ListNode();
            curr = curr.next;
        } 
        return head;
    }
}
