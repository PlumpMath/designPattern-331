package template_method;
/**
 * ������װ���߳�����
 * @author cuiyan
 *
 */
public  abstract class MakeCar {
	//��װ��ͷ
	abstract void makeHead();
	//��װ����
	abstract void makeBody();
	//��װ��β
	abstract void makeTail();
	//����
	abstract boolean checkMake();
	
	public void make(){
		System.out.println("start make car...");
		makeHead();
		makeBody();
		makeTail();
		if(checkMake()){
			System.out.println("make ok");
		}else{
			System.out.println("male failure");
		}
	}
}
