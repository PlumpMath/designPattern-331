package chain_of_responsibily;
/**
 * �����¼��ӿ�
 * @author cuiyan
 *
 */
public interface JsEvent {
	//�¼�����
	public String getType();
	//�¼����ö���
	public Dom getTarget();
	//��ֹð���¼�
	public void stopPropagation();
}
