import java.io.*;
class Charactercountp
{
	public static void main(String args[])
	{
		int i=0,ch=0;
		int cnt[]=new int[255];
		while(i<255)
		{
			cnt[i]=0;
			i++;
		}

		try
		{

		    while(ch!='\n')
		    {
				ch=System.in.read();
			    if(65<=ch && ch<=90)
			    cnt[ch+32]=cnt[ch+32]+1;
			    else
			    cnt[ch]=cnt[ch]+1;
		    }

		}
		catch(IOException e)
		{
			System.out.print(e);
		}
		i=33;
		while(i<255)
		{
			if(cnt[i]>0)
			{
				System.out.println((char)i+"="+cnt[i]);
			}
			i++;
		}
	}
}