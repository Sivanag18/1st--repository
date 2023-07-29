class Lec36_Yshaphed {
    static int intersect(Node head1, Node head2){
       int len1=0;
       int len2 = 0;
       Node temp1= head1;
       Node temp2 = head2;
       while(temp1 != null){
        temp1 =temp1.next;
        len1++;
       }
       while(temp2 != null){
        temp2= temp2.next;
        len2++;
       }
    //    calculated both lengths
    int diff = 0;
    // we will call the longer one as list1
    if(len1>len2){
        temp1 = head1; // call the longer one as list1
        temp2 = head2;  // call the shorter one as list2
        diff = len1-len2; // diff should be positive
    }
    else{
        temp1 = head2;// second list as longer so call it temp1
        temp2 = head1; // call the shorter one as list2
        diff = len2-len1;
    }
    // move the longer one diff steps ahead
    for(int i=0; i<diff; i++){
        temp1 = temp1.next;
    }
    // Move together and compare
    while(temp1 != null && temp2 != null){
        if(temp1 == temp2) return temp1.data;
        temp1 = temp1.next;
        temp2 = temp2.next;
    }

    // Reaching here means  intersection point not found
    return -1; 
 
      
    }    
}
