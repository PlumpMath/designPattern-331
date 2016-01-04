package decorator;

import java.util.List;

public class VarianceCalculator extends OptionalCalculator {

	@Override
	public double getResult(List<Double> list) {
		double result = calculator.getResult(list);
		
		if (list.size() > 20) {
			double num = 0;
			for (int i = 0; i < list.size(); i++) {
				num += (list.get(i) - result) * (list.get(i) - result);
			}
			System.out.println(list.size() + "�����ķ����� " + (num / list.size()));
		} else {
			System.out.println("������������20�������㷽��");
		}
		
		return result;

	}

}
