#include<iostream>
#include<string.h>
using namespace std;

int cmp(char a) {
  int f = 0;
  switch(a) {
    case 'a':
    case 'A':
       f = 1;
      break;
    case 'e':
    case 'E':
       f = 1;
      break;
    case 'I':
    case 'i':
       f = 1;
      break;
    case 'O':
    case 'o':
       f = 1;
      break;
    case 'U':
    case 'u':
       f = 1;
      break;
    default : break;
  }
  return f;
}

int main()
{
  string n;
  cin>>n;
  for(int i=0;i < n.length();i++)
    if(cmp(n[i]) == 1)
      n.replace(i, 1, "");
  cout<<"The output string is "<<n<<endl;
  return 0;
}