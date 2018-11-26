package cn.hibrant.mysqlparser.lexer;

public class Token {

	private String value;
	
	public Token(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
