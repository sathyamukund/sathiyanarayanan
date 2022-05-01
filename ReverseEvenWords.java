package week2.day1;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String test = "I am a automation tester";
  		String[] splitArr=test.split(" ");
			String c=" ";
			String e=" ";


  		for(int i=0;i<splitArr.length;i++)
  		{
  			if(i%2!=0)
  			{
  			String ch=splitArr[i];
  			char[] array=ch.toCharArray();
  			for(int j=array.length-1;j>=0;j--)
  			{
  				c=c+array[j];
  			}
  			}
  			else
  			{
  				e=splitArr[i];
  				System.out.print(c+" "+e);

  			}

  		}

	}

}
