package chain_of_responsibily;

import java.util.ArrayList;
import java.util.List;

/**
 * domԪ�ؼ������� ͬ���Լ�Ҳ��һ��domԪ��
 * @author cuiyan
 *
 */
public class Window extends DomHtml {
	//domԪ�ؼ�������
	List<Dom> elements = new ArrayList<Dom>();
	/**
	 * ��ȡ��һ��dom����
	 * @param dom
	 * @return
	 */
	public Dom nextDom(Dom dom){
		if(dom==null)
			return null;
		int index = elements.indexOf(dom);
		index ++;
		if(index <0 || index >= elements.size())
			return null;
		return elements.get(index);
	}
	/**
	 * ע��
	 * @param dom
	 */
	public void putDom(Dom dom){
		if(dom==null)
			return ;
		this.elements.add(dom);
	}
	/**
	 * ��ȡĿ��domԪ�ص���һ��Ԫ�أ���������һ��Ԫ�ص�ð���¼�����
	 * @param event
	 * @param dom
	 */
	public void flowEvent(JsEvent event,Dom dom){
		Dom next = this.nextDom(dom);
		if(next == null){
			System.out.println("�¼��Ѿ�ð��window����");
			return;
		}
		//����һ�������dom���󷽷��У���this���ݹ�ȥ����Ϊ����һ�������ܻص��������
		next.flowEvent(event, this);
	}
	@Override
	public Dom getParent() {
		// TODO Auto-generated method stub
		return null;
	}
}
