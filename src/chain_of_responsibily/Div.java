package chain_of_responsibily;

public class Div extends DomHtml{
	
	public void catchEvent(JsEvent event){
		System.out.println("-------------divͨ���¼�������--------------------");
		System.out.println(this.getTagName()+" ���¼� "+event.getType() +" �������´���");
		System.out.println("��������");
		System.out.println("--------------�������-----------------");
	}
	@Override
	public Dom getParent() {
		// TODO Auto-generated method stub
		return null;
	}

}
