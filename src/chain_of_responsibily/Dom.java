package chain_of_responsibily;

public interface Dom {
	//��ȡ��ǰdomԪ�ص�����
	public String getTagName();
	
	//��ȡ��dom����
	Dom getParent();
	
	//�¼�ð��
	void flowEvent(JsEvent event, Dom dom);

	//�¼�����
	void catchEvent(JsEvent event);
	
	//��ֹð��
	boolean stopEvent();


}
