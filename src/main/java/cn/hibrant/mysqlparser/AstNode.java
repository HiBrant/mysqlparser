package cn.hibrant.mysqlparser;

public class AstNode {

	private AstNode parent;
	private AstNode[] subNodes;
	
	public AstNode(AstNode parent, int subNodeSize) {
		this.parent = parent;
		this.subNodes = new AstNode[subNodeSize];
	}
	
	public AstNode getParent() {
		return this.parent;
	}
	
	public AstNode getSub(int index) {
		return subNodes[index];
	}
	
	public void setSub(int index, AstNode subNode) {
		this.subNodes[index] = subNode;
	}
}
