package cn.hibrant.mysqlparser.lexer;

public enum Punctuation {

	single_quote("'"),
	double_quote("\""),
	back_quote("`")
	;
	
	private String value;
	private Punctuation(String value) {
		this.value = value;
	}
	
	public String value() {
		return value;
	}
}
