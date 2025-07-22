#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main()
{
  int n;
  cin >> n;

  vector<vector<int>> vec(n, vector<int>(n, 0)); // 3*3 2차원 벡터
  vector<vector<int>> dp(n, vector<int>(n, 0));  // 3*3 2차원 벡터

  for (int i = 0; i < n; i++)
  {
    cin >> vec[i][0] >> vec[i][1] >> vec[i][2];
  }

  for (int i = 0; i < n; i++)
  {
    for (int j = 0; j < 3; j++)
    {
      if (i == 0)
      {
        dp[i][j] = vec[i][j];
      }
      else
      {
        if (j == 0)
        {
          // vec[i-1][1], vec[i-1][2]
          if (dp[i - 1][1] + vec[i][j] <= dp[i - 1][2] + vec[i][j])
          {
            dp[i][j] = dp[i - 1][1] + vec[i][j];
          }
          else
          {
            dp[i][j] = dp[i - 1][2] + vec[i][j];
          }
        }
        if (j == 1)
        {
          // vec[i-1][0], vec[i-1][2]
          if (dp[i - 1][0] + vec[i][j] <= dp[i - 1][2] + vec[i][j])
          {
            dp[i][j] = dp[i - 1][0] + vec[i][j];
          }
          else
          {
            dp[i][j] = dp[i - 1][2] + vec[i][j];
          }
        }
        if (j == 2)
        {
          // vec[i-1][1], vec[i-1][2]
          if (dp[i - 1][0] + vec[i][j] <= dp[i - 1][1] + vec[i][j])
          {
            dp[i][j] = dp[i - 1][0] + vec[i][j];
          }
          else
          {
            dp[i][j] = dp[i - 1][1] + vec[i][j];
          }
        }
      }
    }
  }

  int min = dp[n - 1][0];
  for (int i = 1; i < 3; i++)
  {
    if (min >= dp[n - 1][i])
      min = dp[n - 1][i];
  }

  cout << min << "\n";

  return 0;
}