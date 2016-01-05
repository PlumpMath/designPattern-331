package bridge;
/**
 * ˳ʱ��
 * @className AntiClockwiseDir
 * @todo 
 * @Date 2016��1��5������10:32:46
 */
public class AntiClockwiseDir extends Direction {
	protected void genNextPos() {
		int row = pos.getX();
		int col = pos.getY();
		if (row == min && col > min) {
			col--;
		} else if (row < max && col == min) {
			row++;
		} else if (row == max && col < max) {
			col++;
		} else if (row > min && col == max) {
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
