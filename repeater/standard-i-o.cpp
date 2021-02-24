#include <bits/stdc++.h>

using namespace std;
using ll = long long;
using vi = vector<int>;


int main()
{
    //---------------------BEGIN---------------------//

    int n; cin >> n;

    set<int> s;

    for (int i = 0; i < n; i++)
    {
        int insert; cin >> insert;
        s.insert(insert);
    }

    int ans = 0;
    for(int i:s){
        ans++;
    }
    
    cout << ans;
    
    
    return 0;

}
