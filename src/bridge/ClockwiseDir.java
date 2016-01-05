package bridge;

public class ClockwiseDir extends Direction {
	protected void genNextPos() {
		int row = pos.getX();
		int col = pos.getY();
		if (row == min && col < max) {
			col++;
		} else if (row < max && col == max) {
			row++;
		} else if (row == max && col > min) {
			col--;
		} else if (row > min && col == min) {
			row--;
		} else{
			return; //ƥ�䲻���κ���������ֱ��������ָ���������һ��λ�ã�
		}
		if (row == periodPos.getX() && col == periodPos.getY()) {
			min++;
			max--;
			genNextPos();
			periodPos = new Position(pos.getX(), pos.getY());
		} else {
			pos.setX(row);
			pos.setY(col);
		}
	}

}
