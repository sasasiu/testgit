package lab1;

import static org.junit.Assert.*;
import org.junit.Test;
public class GraphTest {



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
		String input = "to explore strange new worlds to seek out new life and new civilizations and strange civilizations";
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
