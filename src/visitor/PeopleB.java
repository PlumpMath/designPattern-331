package visitor;

public class PeopleB implements Visitor {

	@Override
	public void visit(PartA partA) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(PartB partB) {
		System.out.println("partB����"+partB.getName());
	}

}
