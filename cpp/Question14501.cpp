#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main() {
    // DP 문제
    int N;
    cin >> N;

    vector<int> day(N);
    vector<int> money(N);
    
    vector<int> dp(N + 1, 0);  

    for (int i = 0; i < N; ++i) {
        cin >> day[i] >> money[i];
    }

    for (int i = N - 1; i >= 0; --i) { // 역순으로 계산해야 퇴사일 계산하기 편함
        int next = i + day[i]; // 일하고 난 다음날
        
        if (next <= N) { 
            dp[i] = max(dp[i + 1], money[i] + dp[next]); // dp[i+1] : 상담안함, money[i] + dp[next] : 상담하고 상담일 이후에 금액
        } else { // 일하고 다음날이 퇴사일 다음이면
            dp[i] = dp[i + 1];  // 상담 못 하면 다음날 값 그대로
        }
    }

    cout << dp[0] << endl;
    
    return 0;
}
