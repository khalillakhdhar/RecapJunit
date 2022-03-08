package testing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class TestExemple {
Somme s;
Maclass classtest;
@Before // pour initialiser les instances
// @BeforeEach junit 5
public void init()
{
s=new Somme();	
classtest=new Maclass();
}
	
	
	
@Test // annotation appel d'une configuration
public void testEqual()
{
	
	assertEquals(13, 13);
	
}
@Test
public void testEqualStrings()
{
String a="hello";
String b="world";
assertNotEquals(a, b);
	
}
@Test
public void assertSomme()
{
assertEquals(7, s.calculer(3, 4));	
}
@Test
public void falseCondition()
{
assertFalse(1>10);	
}
@Test
public void AssertionVide()
{
assertNull(classtest.getList()); // verifier la valeur de retour null	

}
@Test
@Ignore // ignore le teste
public void AssertionNot()
{
assertNotNull(classtest.getList());	
}
@Test
public void verifTrue()
{
assertTrue(3>1);	

}
}
