package NewStack;

public class LinkedList_Objek {
    private ListNode_Objek head;
    private int size;

public LinkedList_Objek() {
        head = new ListNode_Objek();
        head.next = head;
        head.prev = head;
        size = 0;
}
public void addBefore(Object x, ListNode_Objek bantu) {
        ListNode_Objek baru = new ListNode_Objek(x);
        baru.next = bantu;
        baru.prev = bantu.prev;
        bantu.prev.next = baru;
        bantu.prev = baru;
        size++;
}
public void addFirst(Object elemen) {
        addBefore(elemen, head.next);
}
public void addLast(Object elemen) {
        addBefore(elemen, head);
}
public Object removeFirst() {
        return remove(head.next);
}
public Object removeLast() {
        return remove(head.prev);
}    
private Object remove(ListNode_Objek bantu) {
        bantu.prev.next = bantu.next;
        bantu.next.prev = bantu.prev;
        size--;
        return bantu.elemen;
}
public int size() {
        return size;
}
public boolean isEmpty() {
        if (head == head.next) {
            return true;
        } else {
            return false;
        }
}
    @Override
public String toString() {
        String temp = "";

        ListNode_Objek bantu = head.next;
        while (bantu != head) {
            temp = temp + bantu.elemen + "\n";
            bantu = bantu.next;
        }
        return temp;
}
public ListNode_Objek Search(Object search){
        ListNode_Objek bantu = head.next;
        while (bantu != head){
            if(((Comparable)bantu.elemen).compareTo(search) == 0){
                return bantu;
            }
            bantu = bantu.next;
        }
        return null;
    }
}
