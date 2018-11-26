package cn.hibrant.mysqlparser.parser;

import cn.hibrant.mysqlparser.ast.AstNode;

public interface SqlParser {

	AstNode parse(String rawSql, AstNode parentNode);
}
