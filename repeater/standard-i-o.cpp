#include <bits/stdc++.h>

using namespace std;
using ll = long long;
using vi = vector<int>;


int main()
{
    //---------------------BEGIN---------------------//

     int ans = 0;

    int n; cin >> n;
    int m; cin >> m;
    int k; cin >> k;

    vector<int> des;
    for (int i = 0; i < n; i++)
    {
        int x; cin>>x;
        des.push_back(x);
    }

    set<int> act;
    for(int i = 0; i < m; i++)
    {
        int x; cin>>x;
        act.insert(x);
    }

    for(int d:des){
        for(int t = d-k; t < d+k+1; t++){
            if(act.count(t) == 1){
                act.erase(t);
                ans++;
                // cout<<"accepted des = " << d << endl;
                break;
            }
        }
    }
    
    

    cout << ans;
    
    return 0;

}
