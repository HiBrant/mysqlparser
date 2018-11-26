package cn.hibrant.mysqlparser.ast;

public abstract class AstNode {

	private AstNode parent;
	private AstNode[] subNodes;
	
	private String rawSql;
	
	public AstNode(String rawSql, AstNode parent) {
		this.rawSql = rawSql;
		this.parent = parent;
		this.subNodes = new AstNode[this.getSubNodeNum()];
	}
	
	public abstract int getSubNodeNum();
	
	public AstNode getParent() {
		return this.parent;
	}
	
	public AstNode getSub(int index) {
		return subNodes[index];
	}
	
	public void setSub(int index, AstNode subNode) {
		this.subNodes[index] = subNode;
	}

	public String getRawSql() {
		return rawSql;
	}

}
