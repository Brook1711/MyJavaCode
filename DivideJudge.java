//作者：brook1711
//功能：判断两个数是否能整除
//日期：2018/8/2
public class DivideJudge
{
	public static void main(String []arg)
	{
		int a=2;
		int b=4;
		if(b%a==0)
		{
			System.out.println("可以整除");
		}
		else
		{
			System.out.println("不能整除！");
		}
		int c=56;
		int d=c++;
		System.out.println("c="+(--c)+";"+"c++="+d);
		
		int e=3;
		int f=++(++e)--;
		System.out.println("++(++3)--="+f);
		
	}
}