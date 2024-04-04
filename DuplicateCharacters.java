public class DuplicateCharacters
{
public static void main(String args[])
{
String string1 = "Great responsibility";
int count;
char String[] = string1.toCharArray();
System.out.println("Duplicate characters in a given string:");
for(int i=0;i<string.length;i++)
{
count = 1;
for(int j=i+1;j<string.length;j++)
{
if(string[i] == string[j] && string[i] != 'o')
{
count++;
string[j]='o';
}
}
if(count>1 && string[i]!='o')
System.out.println(string[i]);
}
}
} 

