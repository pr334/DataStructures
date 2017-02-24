package com.LongIntegerADT;

public class SLLSimpleList implements SimpleList<SLLNode> {
	private SLLNode head;
	private SLLNode tail;
	int Size;

	public SLLSimpleList() {
		head = null;
		tail = null;
		Size = 0;
	}

	@Override
	public void insertFirst(int value) {
		// TODO Auto-generated method stub
		SLLNode Fnode = new SLLNode(value);
		Size++;

		if (head == null) {
			head = Fnode;
			tail = head;
		} else {
			Fnode.setNext(head);
			head = Fnode;
		}
	}

	@Override
	public void insertLast(int value) {
		// TODO Auto-generated method stub
		SLLNode Lnode = new SLLNode(value);
		Size++;

		if (head == null) {
			head = Lnode;
			tail = head;
		} else {
			tail.setNext(Lnode);
			tail = Lnode;
		}
	}

	@Override
	public SLLNode first() {
		// TODO Auto-generated method stub
		return head;
	}

	@Override
	public SLLNode last() {
		// TODO Auto-generated method stub
		return tail;
	}

	@Override
	public boolean isFirst(SLLNode p) {
		// TODO Auto-generated method stub
		boolean bRet = false;
		if (p == head)
			bRet = true;

		return bRet;
	}

	@Override
	public boolean isLast(SLLNode p) {
		// TODO Auto-generated method stub
		boolean bRet = false;
		if (p == tail)
			bRet = true;

		return bRet;
	}

	@Override
	public SLLNode before(SLLNode p) {
		// TODO Auto-generated method stub
		// SLLNode CNode = new SLLNode(0);
		SLLNode CNode = head;
		while (CNode.getNext() != null) {
			if (CNode.getNext() == p)
				return CNode;

			CNode = CNode.getNext();
		}
		return null;
	}

	@Override
	public SLLNode after(SLLNode p) {
		// TODO Auto-generated method stub
		SLLNode CNode = head;
		while (CNode != null) {
			if (CNode == p)
				return CNode.getNext();

			CNode = CNode.getNext();
		}
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return head == null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return Size;
	}

	@Override
	public boolean isArray() {
		// TODO Auto-generated method stub
		return false;
	}
}
