class no5
{
public static void main(String args[])
{
int cnt=1;
for(int i=0;i<5; i++)
{
int cnt2=cnt;
for(int j=0;j<5;j++)
{
if(j+i<=4)
{
System.out.print(cnt2);
cnt2++;
}
else
{
System.out.print(" ");
}
}
cnt++;
System.out.println();
}
}
}

/*12345
  2345
  345
  45
  5*/