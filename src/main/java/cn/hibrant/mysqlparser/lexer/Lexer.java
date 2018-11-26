package cn.hibrant.mysqlparser.lexer;

import java.util.ArrayList;
import java.util.List;

public class Lexer {

	public List<Token> parse(String sql) {
		String[] sgmts = sql.split(" ");
		Token token = null;
		for (String sgmt : sgmts) {
			
		}
		
		List<Token> tokens = new ArrayList<>();
		return tokens;
	}
}
