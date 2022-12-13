import java.io.*;


public class EvalUtil 
{
public static void eval(String javaStr) throws Exception 
{
	StringBuffer str = new StringBuffer();
	str.append("public class Eval {").append("public static void main(String[] args) {").append(javaStr).append("}}");
	OutputStream out = new FileOutputStream("Eval.java");
	out.write(str.toString().getBytes("gbk"));
	out.close();

	Process javacProcess = Runtime.getRuntime().exec("javac Eval.java");
	InputStream compileError = javacProcess.getErrorStream();
	System.err.println(read(compileError));
	compileError.close();

	Process javaProcess = Runtime.getRuntime().exec("java Eval");



	InputStream err = javaProcess.getErrorStream();
	System.err.println(read(err));
	err.close();


	InputStream success = javaProcess.getInputStream();
	System.out.println(read(success));
	success.close();


	new File("Eval.java").delete();
	new File("Eval.class").delete();

}

private static String read(InputStream in) throws IOException 
{
	byte[] b = new byte[1024];
	int len = -1;
	StringBuffer str = new StringBuffer();
	while ((len = in.read(b)) != -1) 
	{
		str.append(new String(b, 0, len, "gbk"));
	}
	return str.toString();
}


public static void main(String[] args) throws Exception 
{
	eval("int a = 4; int b = 10; System.out.println(\"ABC\");");
}

}

