#include<iostream>
#include<stdlib.h>
using namespace std;
int main()
{
  int n,i,j,s=0,flag=0;
  cin>>n;
  int **a = (int**) malloc((n * n) * sizeof(int*));
  int *row = (int*) malloc(n * sizeof(int*));
  int *col = (int*) malloc(n * sizeof(int*));
  
  for(i=0;i<n;i++)
    *(a + i) = (int*) malloc(n * sizeof(int));
  for(i=0;i<n;i++)
    for(j=0;j<n;j++)
   		cin>>(*(*(a + i) + j));
  
    for(i=0;i<n;i++) {
      s = 0;
      for(j=0;j<n;j++)
        s += (*(*(a + i) + j));
      //cout<<"Sum of row "<<(i + 1)<<" is "<<s<<endl;
      *(row + i) = s;
    }
    for(i=0;i<n;i++) {
      s = 0;
      for(j=0;j<n;j++)
        s += (*(*(a + j) + i));
      //cout<<"Sum of col "<<(i + 1)<<" is "<<s<<endl;
      *(col + i) = s;
    }
    s=0;
  	for(i=0;i<n;i++)
  		s += (*(*(a + i) + i));
  
  //cout<<"Diagonal sum is "<<s<<endl;
    for(i=0;i<n;i++)
        if(*(row + i) != *(col + i)) {
			flag = 1;
          break;
        }
   if(flag == 0) {
	if(*(col) == s)
      cout<<"Yes"<<endl;
     else
       cout<<"No"<<endl;
   }
  else
    cout<<"No"<<endl;
  return 0;
}