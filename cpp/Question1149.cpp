#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main()
{
  int n;
  cin >> n;

  vector<vector<int>> vec(n, vector<int>(n, 0));

  for (int i = 0; i < n; i++)
  {
    cin >> vec[i][0] >> vec[i][1] >> vec[i][2];
  }

  for (int i = 0; i < n; i++)
  {
    for (int j = 0; j < n; j++)
    {
      cout << vec[i][j] << " ";
    }
    cout << endl;
  }

  return 0;
}