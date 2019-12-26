package com.banyuan.demo;

class MyQueue {
    MyQueue s1=new MyQueue();
    MyQueue s2=new MyQueue();
    int front;
    private boolean isEmpty;

    /** Initialize your data structure here. */
    public MyQueue() {


    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        if(s1==null){

        }
        while(s1!=null)
        s2.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
//    public int pop() {
//
//    }
//
//    /** Get the front element. */
//    public int peek() {
//
//    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
return s1.isEmpty;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */