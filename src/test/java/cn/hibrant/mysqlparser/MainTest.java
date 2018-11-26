package cn.hibrant.mysqlparser;

import org.junit.Test;

import cn.hibrant.mysqlparser.ast.AstNode;
import cn.hibrant.mysqlparser.ast.SelectNode;

public class MainTest {

	@Test
	public void test() {
		String sql = "select distinct a from t where b=2 and c='gg wp' group by c order by a limit 5";
		AstNode select = new SelectNode(sql, null);
		
		System.out.println("end");
	}
}
