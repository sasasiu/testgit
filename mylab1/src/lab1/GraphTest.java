package lab1;

import static org.junit.Assert.*;
import org.junit.Test;
public class GraphTest {



	
	@Test
	public void testcalcShortestPath1() {
		String input = "to explore strange new worlds to seek out new life and new civilizations";
		String word1 = "aaaa",word2="strange";
		String result = new Graph(input).calcShortestPath(word1, word2);
		assertEquals("path don't exist",result);
	}
	@Test
	public void testcalcShortestPath4() {
		String input = "to explore strange new worlds to seek out new life and new civilizations";
		String word1 = "to",word2="explore";
		String result = new Graph(input).calcShortestPath(word1, word2);
		assertEquals("to---->explore",result);
	}//sadsdasddsads
	@Test
	public void testcalcShortestPath5() {
		String input = "to explore strange new worlds to seek out new life and new civilizations";
		String word1 = "civilizations",word2="new";
		String result = new Graph(input).calcShortestPath(word1, word2);
		assertEquals("NO SHORTEST PATH!!!",result);
	}
	@Test
	public void testcalcShortestPath6() {
		String input = "to explore strange new worlds to seek out new life and new civilizations seek out seek out";
		String word1 = "to",word2="new";
		String result = new Graph(input).calcShortestPath(word1, word2);
		assertEquals("to---->explore---->strange---->new",result);
	}
	@Test
	public void testcalcShortestPath8() {
		String input = "to explore strange new worlds seek out new life and new civilizations seek out seek out";
		String word1 = "new",word2="to";
		String result = new Graph(input).calcShortestPath(word1, word2);
		assertEquals("NO SHORTEST PATH!!!",result);
	}
	@Test
	public void testQueryBridgeWords1() {
		String input = "to explore strange new worlds to seek out new life and new civilizations and strange civilizations";
		String word1 = "to",word2="and";
		String result = new Graph(input).queryBridgeWords(word1, word2);
		assertEquals("",result);
	}
	
	@Test
	public void testQueryBridgeWords2() {
		String input = "to explore strange new worlds to seek out new life and new civilizations and strange civilizations";
		String word1 = "aaa",word2="strange";
		String result = new Graph(input).queryBridgeWords(word1, word2);
		assertEquals("",result);
	}

	@Test
	public void testQueryBridgeWords3() {
		String input = "to explore strange new worlds to seek out new life and new civilizations and strange civilizations";
		String word1 = "to",word2="strange";
		String result = new Graph(input).queryBridgeWords(word1, word2);
		assertEquals("explore",result);
	}

	@Test
	public void testQueryBridgeWords4() {
		String input = "to explore strange new worlds to seek out new life and new civilizations and strange civilizations";
		String word1 = "to",word2="explore";
		String result = new Graph(input).queryBridgeWords(word1, word2);
		assertEquals("",result);
	}

	@Test
	public void testQueryBridgeWords5() {
		String input = "to explore XWstrange new worlds to seek out new life and new civilizations and strange civilizations";
		String word1 = "and",word2="civilizations";
		String result = new Graph(input).queryBridgeWords(word1, word2);
		assertEquals("strange",result);
	}
	@Test
	public void testQueryBridgeWords6() {
		String input = "to explore strange new worlds to seek out new life and new civilizations and strange civilizations";
		String word1 = "life",word2="new";
		String result = new Graph(input).queryBridgeWords(word1, word2);
		assertEquals("and",result);
	}
}
