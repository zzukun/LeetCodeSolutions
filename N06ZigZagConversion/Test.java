package N06ZigZagConversion;

//??
// �����ʼ��������ʲô��
public class Test {
	public void run()
	{
		char[][] unfold = new char[3][5];
		for(int i= 0; i<3;i++)
		{
			for(int j = 0; j<5;j++)
			{
				String s  = "" + unfold[i][j];
				System.out.println(s.getBytes());
			}
		}
	}
	
	public static void main(String[] args) {
		
		new Test().run();
	}
}
