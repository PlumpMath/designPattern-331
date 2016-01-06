package chain_of_responsibily;

public abstract class DomHtml implements Dom {
	//html Ԫ��ID
	private String id;
	
	//html Ԫ������
	private String tagName;
	
	//htmlԪ��js ������
	private String eventFunction="";
	
	@Override
	public String getTagName() {
		// TODO Auto-generated method stub
		return this.tagName;
	}

	@Override
	public abstract Dom getParent() ;

	/**
	 * ð��
	 */
	public void flowEvent(JsEvent event, Dom dom) {
		//����ð��
		System.out.println(this.getTagName()+"������ "+event.getType());
		//ִ���¼��ķ���
		this.catchEvent(event);
		//�Ƿ�ֹͣð��
		if(stopEvent())
			return ;
		//����dom
		dom.flowEvent(event, this);
		
		//����ð���¼���
		System.out.println(this.getTagName() +"������ "+event.getType());
		this.catchEvent(event);
		if(stopEvent())
			return;
	}
	/**
	 * ģ���Ĭ�ϴ�����
	 */
	@Override
	public void catchEvent(JsEvent event) {
		if(this.eventFunction == null || "".equals(this.eventFunction.trim()))
			System.out.println(this.getTagName() +"δ���¼� "+event.getType() +"���д���");
		else{
			System.out.println(this.getTagName() +"���¼� "+event.getType() +"�������´���");
			System.out.println(this.eventFunction);
			System.out.println("----------�������-------------");
		}
	}

	@Override
	public boolean stopEvent() {
		if(this.eventFunction !=null && this.eventFunction.indexOf("stopPropagation") !=-1){
			System.out.println("----------ֹͣ����ð��------------");
			return true;
		}
		System.out.println(this.getTagName() +"δ��ֹ�¼�ð��");
		return false;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEventFunction() {
		return eventFunction;
	}

	public void setEventFunction(String eventFunction) {
		this.eventFunction = eventFunction;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

}
