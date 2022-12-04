import java.io.*;
import java.util.regex.*; 
/**
 * Date:4/12/2022<br>
 * @author jinniu
 * @version 1.0
 */

public class Subbyte
{
    /**
     * 按字节数截取字符串
     *
     * @param str           要截取的字符串
     * @param begin         开始截取的位置
	 * @param end           结束截取的位置
     * @return 
     */
    public static String substringByByte(String str, int begin, int end)
	{
        //删掉字符串中所有的的空格回车等
        String replaceBlank = str.replace(" ", "").replace("\r\n\t","");
        char[] chars = replaceBlank.toCharArray();
        StringBuffer sb = new StringBuffer();
        int chLength=2;
        int enLength=1;
        //判断loopChar是否为中文
        Pattern pc = Pattern.compile("[\u4e00-\u9fa5]");
        Matcher mc;     
        int length = 0;
        for (char loopChar : chars) {
            mc = pc.matcher(String.valueOf(loopChar));
            //如果为中文占2字节，如果是英文字符或数字占1字节，总长度超过要截取的长度跳出循环
			if (mc.find()){
				length += 2;
			}
			else {
				length++;
			}
			//如果截取长度规则，本次规则是如果begin坐标为半个汉字则获取全个汉字，右边汉字半个则舍弃
			if (length > begin && length <= end)
			{
				sb.append(loopChar);
			}
			else if(length > end)
			{
				break;
			}			
        }
		//返回字符串
        return sb.toString();
    }

	public static void main(String[] args) throws Exception
	{
		Subbyte sb = new Subbyte();
		String str = "学英文从练习册的ABC开始好不好";
		System.out.println(sb.substringByByte(str, 4, 17));
		
    }
}