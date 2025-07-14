#include <iostream>
#include <string>
#include <stack>
using namespace std;

int main()
{
  int testcase;
  cin >> testcase;

  while (testcase--)
  {

    string line;
    cin >> line;

    stack<char> st;

    for (char c : line)
    {
      if (!st.empty() && st.top() == '(' && c == ')')
        st.pop(); // 짝 달라야 제거
      else
        st.push(c); // 아니면 넣기
    }

    if (st.empty())
      cout << "YES" << endl;
    else
      cout << "NO" << endl;
  }

  return 0;
}