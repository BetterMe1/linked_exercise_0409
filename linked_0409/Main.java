package linked.linked_0409;

public class Main {
}
/*
题目：给定链表的头指针和一个节点指针，在O(1)时间删除该节点。
分析：用要删除节点的下一个节点的数据覆盖要删除节点的数据，然后删除下一个节点。此方法不能用来删除尾节点。
 */
/*
class Solution{
    public static void deleteNode(ListNode head, ListNode deleteNode){
        //传入的两个节点不能为null
        if(head == null || deleteNode == null){
            return;
        }
        //要删除的节点是头节点
        if(head == deleteNode){
            head = head.next;//更新头部
            deleteNode.next == null;//删除
        }else if(deleteNode.next != null){//要删除的节点不是尾节点
            deleteNode.data = deleteNode.next.data;//修改数据
            deleteNode.next = deleteNode.next.next;//删除节点
        }else{//要删除的节点是尾节点
            ListNode cur = head;
            while(cur.next != deleteNode){
                cur = cur.next;
            }
            cur.next = null; //删除
        }
    }
}
*/
/*
反转一个单链表。
 */
/*
//循环法
class Solution {
    public static ListNode reverseByLoop(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode pre = null;
        ListNode next = null;
        while(head != null){
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}
*/

/*
//递归法
class Solution {
    public static ListNode reverseByRecursion(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newhead = reverseByRecursion(head.next);
        head.next.next = head;
        head.next = null;
        return newhead;
    }
}*/
/*
//求单链表的倒数第K个节点
class Solution {
    public static ListNode searchKNode(ListNode head,int K) {
        if(k<0){
            return null;
        }
        ListNode slowNode = head;
        ListNode fastNode = head;
        //快指针先走K步
        int i=0;
        for(; i<K && fastNode != null; i++){
            fastNode = fastNode.next;
        }
        //长度问题
        if(i != K){
            return null;
        }
        //快、慢指针同时走
        while(fastNode != null){
            slowNode = slowNode.next;
            fastNode = fastNode.next;
        }
        return slowNode;
    }
}*/

/*
//判断两个单链表是否相交（链表无环）
class Solution {
    public static boolean isIntersect(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return false;
        }
        ListNode curA = headA;
        ListNode curB = headB;
        while(curA.next != null){
            curA = curA.next;
        }
        while(curB.next != null){
            curB = curB.next;
        }
        return curA == curB;
    }
}*/
