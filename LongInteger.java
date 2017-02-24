package com.LongIntegerADT;


public class LongInteger {

	private SimpleList List = new ArraySimpleList();
	//private SimpleList List = new SLLSimpleList();
	
	private boolean sign = true;
	private int digitLength = 0;
	//boolean sub_sign = false;

	public LongInteger(String S) {
		boolean IsFnodeAdded = false;

		char F = S.charAt(0);
		if (F == '-') {
			sign = false;
			S = S.substring(1);
		}
		digitLength = S.length();

		int FNodeLength = digitLength % 4;
		int Index = 0;
		int indSiz = (digitLength+3)/4;
		
		if(List.isArray())
			List = new ArraySimpleList(indSiz);

		while (Index < digitLength) { 
			if (FNodeLength > 0 && !IsFnodeAdded) {
				int NodeValue = Integer.parseInt(S.substring(Index, FNodeLength));
				List.insertFirst(NodeValue);
				IsFnodeAdded = true;
				Index += FNodeLength;
			} else {
				String temp = S.substring(Index, Index + 4);
				int NodeValue = Integer.parseInt(temp);
				List.insertFirst(NodeValue);
				Index += 4;
			}
		}
	}

	public LongInteger() {

	}
	
	public LongInteger(int pSize){
		if(List.isArray())
			List = new ArraySimpleList(pSize);
	}
	public void output() {
		Position PosValue = List.last();
		UtilityOperations objUO = new UtilityOperations();
		String temp2 = null;
		String temp3 = null;
		int Size = 0;

		while (PosValue != null) {	
			int CNValue = PosValue.getValue();
			int CNLen = objUO.digits(CNValue);
			Size = Size + CNLen;

			if (CNLen != 4) {
				temp3 = String.format("%04d", CNValue);
			} else {
				temp3 = Integer.toString(CNValue);
			}

			if (List.isLast(PosValue)) {
				if (getSign())
					temp2 = Integer.toString(CNValue);
				else
					temp2 = "-" + Integer.toString(CNValue);
			} else
				temp2 = temp2 + temp3;

			PosValue = List.before(PosValue);
		}
		
		if(digitLength == 0)
			digitLength = Size;
		
		System.out.println(temp2);
	}

	public void nodeDisplay() {
		Position pValue = List.first();
		UtilityOperations objUO = new UtilityOperations();

		System.out.print("HEAD");
		System.out.print(" -> ");

		while (pValue != null) {
			int CNValue = pValue.getValue();
			int CNLen = objUO.digits(CNValue);

			if (CNLen == 4) {
				System.out.print(CNValue);
			} else {
				String Formated = String.format("%04d", CNValue);
				System.out.print(Formated);
			}
			System.out.print(" -> ");
			pValue = List.after(pValue);
		}

		System.out.print("NULL");
		System.out.println("");
	}

	public boolean getSign() {

		return sign;
	}

	public int getDigitCount() {

		return digitLength;
	}

	public boolean equalto(LongInteger i) {
		boolean bRet = false;
		if (getDigitCount() == i.getDigitCount() && getSign() == i.getSign()) {
			Position pLeftValue = List.last();
			Position pRightValue = i.List.last();
			
			while (!List.isFirst(pLeftValue)) {
				if (pLeftValue.getValue() != pRightValue.getValue())
					return bRet;

				pLeftValue  = List.before(pLeftValue);
				pRightValue = i.List.before(pRightValue);
			}
			if (pLeftValue.getValue() != pRightValue.getValue())
				return bRet;

			bRet = true;
		}
		return bRet;
	}

	public boolean lessthan(LongInteger i) {
		boolean bRet = false;

		if (getSign() != i.getSign()) {
			if (getSign())
				return bRet;
			else
				return true;
		} else if (getSign()) {

			if (getDigitCount() > i.getDigitCount())
				return bRet;
			else if (getDigitCount() < i.getDigitCount())
				return true;
			else if (equalto(i))
				return bRet;
			else {
				Position pLeftValue = List.last();
				Position pRightValue = i.List.last();
				
				while (!List.isFirst(pLeftValue)) {
					if (pLeftValue.getValue() > pRightValue.getValue())
						return bRet;

					pLeftValue = List.before(pLeftValue);
					pRightValue =i.List.before(pRightValue);
				}
				if (pLeftValue.getValue() > pRightValue.getValue())
					return bRet;

				bRet = true;
			}
		} else {

			if (getDigitCount() > i.getDigitCount())
				return true;
			else if (getDigitCount() < i.getDigitCount())
				return bRet;
			else if (equalto(i))
				return bRet;
			else {
				Position pLeftValue = List.last();
				Position pRightValue = i.List.last();

				while (!List.isFirst(pLeftValue)) {
					if (pLeftValue.getValue() < pRightValue.getValue())
						return bRet;

					pLeftValue = List.before(pLeftValue);
					pRightValue = i.List.before(pRightValue);
				}
				if (pLeftValue.getValue() < pRightValue.getValue())
					return bRet;

				bRet = true;
			}
		}
		return bRet;
	}

	public boolean greaterthan(LongInteger i) {

		boolean bRet = true;

		if (getSign() != i.getSign()) {
			if (getSign())
				return bRet;
			else
				return false;
		} else if (getSign()) {

			if (getDigitCount() > i.getDigitCount())
				return bRet;
			else if (getDigitCount() < i.getDigitCount())
				return false;
			else if (equalto(i))
				return false;
			else {
				Position pLeftValue = List.last();
				Position pRightValue = i.List.last();

				while (!List.isFirst(pLeftValue)) {
					if (pLeftValue.getValue() < pRightValue.getValue())
						return false;

					pLeftValue = List.before(pLeftValue);
					pRightValue = i.List.before(pRightValue);
				}
				if (pLeftValue.getValue() < pRightValue.getValue())
					return false;
			}
		} else {

			if (getDigitCount() > i.getDigitCount())
				return false;
			else if (getDigitCount() < i.getDigitCount())
				return bRet;
			else if (equalto(i))
				return false;
			else {
				Position pLeftValue = List.last();
				Position pRightValue = i.List.last();

				while (!List.isFirst(pLeftValue)) {
					if (pLeftValue.getValue() > pRightValue.getValue())
						return false;

					pLeftValue = List.before(pLeftValue);
					pRightValue = i.List.before(pRightValue);
				}
				if (pLeftValue.getValue() > pRightValue.getValue())
					return false;
			}
		}
		return bRet;
	}

	public LongInteger add(LongInteger i) {
		int resSize = 0;
		int LdigCount = getDigitCount();
		int RdigCount = i.getDigitCount();
		
		if(LdigCount > RdigCount)
			resSize = (getDigitCount() / 4)+1;
		else
			resSize = (i.getDigitCount() / 4)+1;
		
		LongInteger sumResult = new LongInteger(resSize);
		UtilityOperations objUO = new UtilityOperations();

		boolean Lsign = sign;
		boolean Rsign = i.sign;

		int carry = 0;
		int nodeVal1 = 0;
		int nodeVal2 = 0;
		int nodeSum = 0;
		int SumOverF = 0;

		if (sign == i.sign) {
			sumResult.sign = sign;
			Position lPosition = List.first();
			Position rPosition = i.List.first();
			
			while (lPosition != null && rPosition != null) {
				nodeVal1 = lPosition.getValue();
				nodeVal2 = rPosition.getValue();
				nodeSum = nodeVal1 + nodeVal2 + carry;

				SumOverF = objUO.overflow(nodeSum);
				carry = objUO.underflow(nodeSum);

				sumResult.List.insertLast(SumOverF);

				if (List.after(lPosition) == null && i.List.after(rPosition) == null && carry > 0) {
					sumResult.List.insertLast(carry);
				}

				lPosition = List.after(lPosition);
				rPosition = i.List.after(rPosition);
			}

			if (lPosition == null) {
				while (rPosition != null) {
					nodeVal2 = rPosition.getValue();
					nodeSum = nodeVal2 + carry;

					SumOverF = objUO.overflow(nodeSum);
					carry = objUO.underflow(nodeSum);

					sumResult.List.insertLast(SumOverF);

					if (i.List.after(rPosition) == null && carry > 0) {
						sumResult.List.insertLast(carry);
					}

					rPosition = i.List.after(rPosition);
				}

			} else {
				while (lPosition != null) {
					nodeVal1 = lPosition.getValue();
					nodeSum = nodeVal1 + carry;

					SumOverF = objUO.overflow(nodeSum);
					carry = objUO.underflow(nodeSum);

					sumResult.List.insertLast(SumOverF);

					if (List.after(lPosition) == null && carry > 0) {
						sumResult.List.insertLast(carry);
					}

					carry = 0;
					lPosition = List.after(lPosition);
				}
			}
		} else {
			
			i.sign = !i.sign;
			sumResult = subtract(i);

			 sign = Lsign;
			 i.sign = Rsign;

			 sign = true;
			 i.sign = true;

			 if (greaterthan(i) || equalto(i))
				 sumResult.sign = Lsign;
			 else
				 sumResult.sign = Rsign;

			 sign = Lsign;
			 i.sign = Rsign;
		}
		return sumResult;
	}

	public LongInteger subtract(LongInteger i) {

		LongInteger subResult = new LongInteger();
 
		boolean Lsign = sign;
		boolean Rsign = i.sign;

		i.sign = !i.sign;

		if (Lsign == i.sign) {
			subResult = add(i);
			subResult.sign = sign;
			//sub_sign = subResult.sign;
			sign = Lsign;
			i.sign = Rsign;
		} else {
			sign = true;
			i.sign = true;

			if(equalto(i)){
				subResult = new LongInteger(1);// added
				subResult.List.insertLast(0);
				sign = Lsign;
				i.sign = Rsign;
				return subResult;
			}
			
			int nodeVal1 = 0;
			int nodeVal2 = 0;
			int nodeDiff = 0;

			boolean Isborrowed = false;

			Position LNode = List.first();
			Position RNode = i.List.first();

			if (greaterthan(i) || equalto(i)) {
				subResult = new LongInteger(getDigitCount());//Added
				subResult.sign = Lsign;

				while (LNode != null && RNode != null) {
					nodeVal1 = LNode.getValue();
					nodeVal2 = RNode.getValue();

					if (Isborrowed) {
						nodeVal1 = nodeVal1 - 1;
						Isborrowed = false;
					}

					if (nodeVal1 < nodeVal2) {
						nodeVal1 = 10000 + nodeVal1;
						Isborrowed = true;
					}

					nodeDiff = nodeVal1 - nodeVal2;
					subResult.List.insertLast(nodeDiff);

					LNode = List.after(LNode);
					RNode = i.List.after(RNode);
				}

				while (LNode != null) {
					nodeVal1 = LNode.getValue();

					if (Isborrowed) {
						nodeVal1 = nodeVal1 - 1;
						Isborrowed = false;
					}

					subResult.List.insertLast(nodeVal1);
					LNode = List.after(LNode);
				}
			} else {
				subResult = new LongInteger(i.getDigitCount());
				subResult.sign = !Rsign;

				while (LNode != null && RNode != null) {
					nodeVal1 = LNode.getValue();
					nodeVal2 = RNode.getValue();

					if (Isborrowed) {
						nodeVal2 = nodeVal2 - 1;
						Isborrowed = false;
					}

					if (nodeVal1 > nodeVal2) {
						nodeVal2 = 10000 + nodeVal2;
						Isborrowed = true;
					}

					nodeDiff = nodeVal2 - nodeVal1;
					subResult.List.insertLast(nodeDiff);

					LNode = List.after(LNode);
					RNode = i.List.after(RNode);
				}

				while (RNode != null) {
					nodeVal2 = RNode.getValue();

					if (Isborrowed) {
						nodeVal2 = nodeVal2 - 1;
						Isborrowed = false;
					}

					subResult.List.insertLast(nodeVal2);
					RNode = i.List.after(RNode);
				}
			}

			sign = Lsign;
			i.sign = Rsign;
		}
		//sub_sign = subResult.sign;
		return subResult;
	}

	public LongInteger multiply(LongInteger i) {
		int Size = ((getDigitCount()+i.getDigitCount())/4)+2;
		LongInteger mulResult = new LongInteger(Size);
		UtilityOperations objUO = new UtilityOperations();

		boolean Lsign = sign;
		boolean Rsign = i.sign;

		int bNode = 0;
		int uNode = 0;
		int mulOF = 0;
		int carry = 0;
		int Znode = 0;
		int mulTemp = 0;
		

		sign = true;
		i.sign = true;

		Position RNode = i.List.first();

		while (RNode != null) {
			bNode = RNode.getValue();
			LongInteger tempRes = new LongInteger(Size);
			Position LNode = List.first();

			while (LNode != null) {

				if (List.isFirst(LNode)) {
					for (int Index = 0; Index < Znode; Index++) {
						tempRes.List.insertLast(0);
						tempRes.digitLength = tempRes.digitLength + 4;
					}
				}

				uNode = LNode.getValue();
				mulTemp = (bNode * uNode) + carry;

				mulOF = objUO.overflow(mulTemp);
				carry = objUO.underflow(mulTemp);
				
				tempRes.List.insertLast(mulOF);
				tempRes.digitLength = tempRes.digitLength + 4;

				if (List.after(LNode) == null && carry > 0) {
					tempRes.List.insertLast(carry);
					tempRes.digitLength = tempRes.digitLength + 4;
					carry = 0;
				}

				LNode = List.after(LNode);
			}

			mulResult = mulResult.add(tempRes);
			mulResult.digitLength = tempRes.getDigitCount();
			
			RNode = i.List.after(RNode);
			Znode = Znode + 1;
		}

		if (Lsign == Rsign)
			mulResult.sign = true;
		else
			mulResult.sign = false;

		sign = Lsign;
		i.sign = Rsign;

		return mulResult;
	}

	public LongInteger power(int p) {
		LongInteger powRes = new LongInteger(1);
		powRes.List.insertLast(1);
		boolean Lsign = sign;
		
		if (p == 0) {
			return powRes;
		} else {

			int[] twoPowers = new int[100];

			LongInteger tempMulRes = new LongInteger(1);

			int Iterator = 1;
			int Iterator2 = 1;
			int Index = 0;
			int MaxIndex = 0;
			int temp = p;
			int check = 0;
			int LoopIndex = 0;

			while (Iterator <= p) {
				twoPowers[Index] = Iterator;
				Iterator += Iterator;
				Index = Index + 1;
			}

			int[] mulPowers = new int[Index];
			MaxIndex = Index - 1;

			for (int i = MaxIndex; i >= 0; i--) {
				check = twoPowers[i];
				if (check <= temp) {
					mulPowers[LoopIndex] = check;
					LoopIndex = LoopIndex + 1;
					temp = temp - check;
				}
			}

			while (Iterator2 <= p) {

				if (Iterator2 == 1)
					tempMulRes = this;
				else
					tempMulRes = tempMulRes.multiply(tempMulRes);
				
				for (int j : mulPowers) {

					if (j == Iterator2) {
						powRes = powRes.multiply(tempMulRes);
						break;
					}
				}
				Iterator2 += Iterator2;
			}
			
			if(p % 2 == 0)
				powRes.sign = true;
			else
				powRes.sign = Lsign;
		}
		return powRes;
	}
}
