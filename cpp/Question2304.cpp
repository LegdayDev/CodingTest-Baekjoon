#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main()
{
  int n;
  cin >> n;

  vector<vector<int>> vec(n, vector<int>(n, 0));

  for(int i=0;i<n;i++){
    cin >> vec[i][0] >> vec[i][1];
  }

  

  return 0;
}