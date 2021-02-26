//---------------------------------------------------//

// Practicing Ad Hoc Problems
// February 25rd, 2021

// USACO 2018 January Contest, Bronze, Problem 3. Out of Place
// usaco.org/index.php?page=viewproblem2&cpid=785



//---------------------------------------------------//

#include <bits/stdc++.h>

using namespace std;
using ll = long long;
using vi = vector<int>;

void setIO(string s){ //this function is the template that redefines the standard IO
    ios_base::sync_with_stdio(0);cin.tie(0);
    freopen((s+".in").c_str(),"r",stdin);
    freopen((s+".out").c_str(),"w",stdout);
}

int main()
{
    // setIO("repeater");
    setIO("outofplace");   

    //---------------------BEGIN---------------------//

    int ans = 0;

    int n; cin >> n;
    vi heights(n);

    for (int i = 0; i < n; i++)
    {
        int x; cin >> x;
        heights[i] = x;
    }

    int b = 0;
    int x = heights[0];
    int y = heights[1];
    int count = 1;

    while (count < n && x <= y){
        x = heights[count];
        y = heights[count + 1];
        count++;
    }
    b = count;
    // cout<<b<<endl;

    if( b == n){
        cout << ans;
        return 0;
    }
    

    while(b>0 && heights[b] < heights[b-1]){
        int distance = 1;
        while(b-distance-1>=0 && heights[b-1]==heights[b-distance-1]){
            distance++;
        }
        int temp = heights[b];
        heights[b] = heights[b-distance];
        heights[b-distance]= temp;
        b-=distance;
        ans++;
    }


    // for (int h:heights)
    // {
    //     cout<<h<<endl;
    // }
    // cout<<b<<endl;
    

    cout << ans;
        
    return 0;

}
