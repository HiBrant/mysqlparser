package cn.hibrant.mysqlparser.ast;

public class SelectNode extends AstNode {
	
	public static final int IDX_SELECT_ITEMS 	= 0;
	public static final int IDX_FROM 			= 1;
	public static final int IDX_WHERE 			= 2;
	public static final int IDX_GROUP_BY 		= 3;
	public static final int IDX_ORDER_BY 		= 4;
	public static final int IDX_LIMIT 			= 5;
	
	public SelectNode(String rawSql, AstNode parent) {
		super(rawSql, parent);
	}
	
	@Override
	public int getSubNodeNum() {
		return 6;
	}
}
