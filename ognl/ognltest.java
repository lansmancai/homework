import ognl.Ognl;
import ognl.OgnlContext;
import ognl.OgnlException;


public class ognltest{
	public static void main(String[] args)  throws Exception
	{
		User a  = new User();
		a.setName("xiaoli");
 
		User b = new User();
		b.setName("xiaowang");
 
		OgnlContext ctx = new OgnlContext();
 

		ctx.put("first", a);
		ctx.put("second",b);
		ctx.setRoot(a);//
		
		
		String x = (String) Ognl.getValue("#first.name", ctx, a);
		System.out.println(x);
		
		String y = (String) Ognl.getValue("name", ctx, a);
		System.out.println(y);
		
		String z = (String) Ognl.getValue("#second.name", ctx, b);
		System.out.println(z);
	}
}
