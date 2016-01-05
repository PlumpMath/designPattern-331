package bridge;

public abstract class Direction {
	protected StartPos startPos;
	protected Position pos;// ���ڵ�λ��
	protected Position periodPos;// һ�����ڵĿ�ʼλ��
	protected int max;// ���е����ֵ
	protected int min;// ���е���Сֵ
	protected int len;// ����Ľ���
	private void init() {
		if (startPos == null || len <= 0)
			return;
		Position tempPos = startPos.getPos(len);
		pos = new Position(tempPos.getX(), tempPos.getY());
		periodPos = new Position(tempPos.getX(), tempPos.getY());
		max = len - 1;
		min = 0;
	}

	public void setStartPos(StartPos startPos) {// ���ÿ�ʼλ�ò����³�ʼ��
		this.startPos = startPos;
		init();
	}

	public void setLen(int len) {// ���ó��Ȳ����³�ʼ��
		this.len = len;
		init();
	}

	public int getLen() {
		return len;
	}

	public Position getPos() {
		int currRow = pos.getX();
		int currCol = pos.getY();
		Position currPos = new Position(currRow, currCol);
		genNextPos();
		return currPos;
	}

	protected abstract void genNextPos();

}
