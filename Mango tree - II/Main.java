#include<iostream>
using namespace std;
int main()
{
  int row,col,n;
  cin>>row>>col>>n;
  int s = row * col;
  if((n >= 1 && n <= row) || (n <= s && n >= s - row) || (n == 2 * row + 1))
    cout<<"Yes"<<endl;
  else
    cout<<"No"<<endl;
  return 0;
}