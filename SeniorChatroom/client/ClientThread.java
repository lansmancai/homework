
import java.io.*;

public class ClientThread extends Thread
{
	// �ÿͻ����̸߳������������
	BufferedReader br = null;
	// ʹ��һ�������������������ͻ����߳�
	public ClientThread(BufferedReader br)
	{
		this.br = br;
	}
	public void run()
	{
		try
		{
			String line = null;
			// ���ϵش��������ж�ȡ���ݣ�������Щ���ݴ�ӡ���
			while ((line = br.readLine())!= null)
			{
				System.out.println(line);
			}
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
		// ʹ��finally�����رո��̶߳�Ӧ��������
		finally
		{
			try
			{
				if (br != null)
				{
					br.close();
				}
			}
			catch (IOException ex)
			{
				ex.printStackTrace();
			}
		}
	}
}
