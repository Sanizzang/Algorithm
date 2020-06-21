/*
 *	Date: 20.06.21
 *	Writer: Steven, Lee
 *
 * 	Problem: LRU Cache 146 from Leetcode
 */

import java.util.*;
import java.io.*;

class DoublyLinkedList{
	private DoublyLinkedList past;
	private DoublyLinkedList next;
	private int key, val;
	
	DoublyLinkedList() {}
	DoublyLinkedList(int key, int val){
		this.key = key;
		this.val = val;

		this.past = new DoublyLinkedList();
		this.next = new DoublyLinkedList();
	}

	public void setPast(DoublyLinkedList node) { this.past = node; }
	public void setNext(DoublyLinkedList node) { this.next = node; }
	public void setVal(int val) { this.val = val; }

	public DoublyLinkedList getPast() { return this.past; }
	public DoublyLinkedList getNext() { return this.next; }
	public int getKey() { return this.key; }
	public int getVal() { return this.val; }
}

public class Steven{
	private Map<Integer, DoublyLinkedList> map;
	private DoublyLinkedList head, tail;
	private int capacity;

	public Steven(int capacity){
		map = new HashMap<>();
		head = new DoublyLinkedList();
		tail = new DoublyLinkedList();
		this.capacity = capacity;

		head.setNext(tail);
		tail.setPast(head);
	}

	public void disconnect(DoublyLinkedList node){
                node.getNext().setPast(node.getPast());
                node.getPast().setNext(node.getNext());
        }

        public void updateNodeWithHead(DoublyLinkedList node){
                head.getNext().setPast(node);
                node.setNext(head.getNext());
                head.setNext(node);
                node.setPast(head);
        }

        public int get(int key){
                if(!map.containsKey(key))
                        return -1;

                DoublyLinkedList node = map.get(key);
                disconnect(node);
                updateNodeWithHead(node);

                return node.getVal();
        }

        public void put(int key, int value){
                if(map.containsKey(key)){
                        DoublyLinkedList node = map.get(key);
                        node.setVal(value);
                        disconnect(node);
                        updateNodeWithHead(node);

                        return;
                }

                if(capacity == map.size()){
                        map.remove(tail.getPast().getKey());

                        tail.getPast().getPast().setNext(tail);
                        tail.setPast(tail.getPast().getPast());
                }

                DoublyLinkedList node = new DoublyLinkedList(key, value);
                updateNodeWithHead(node);

                map.put(key, node);
        }


	public static void main(String[] args) throws Exception{
		Steven lru = new Steven(2);
		lru.put(1, 1);
		lru.put(2, 2);
		lru.get(1);
		lru.put(3, 3);
		lru.get(2);
		lru.put(4, 4);
		lru.get(1);
		lru.get(3);
		lru.get(4);
	}
}
/* 
 *  I got a idea for the problem from stack and queue.
 * let's assume that numbers stack into the cache from left to right. if the size of the cache is out of the capacity, then remove
 * a number on the rightmost. If some number 
 *
 *
 *
 */
