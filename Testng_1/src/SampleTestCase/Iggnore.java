package SampleTestCase;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Iggnore {
	@Test
public void aa() {
	System.out.println("aaaa");
}
@Test
public void bb() {
	System.out.println("bbbb");
}
@Test
public void cc() {
	System.out.println("ccc");
}
@Test
@Ignore
public void dd() {
	System.out.println("dddd");
}@Test

public void  ee() {
	System.out.println("eee");
}
}
