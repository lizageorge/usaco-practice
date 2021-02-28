//---------------------------------------------------//

// Practicing creating comparators and structs
// February 27rd, 2021

// USACO 2019 January Contest, Silver, Problem 3. Mountain View
// http://www.usaco.org/index.php?page=viewproblem2&cpid=896

//---------------------------------------------------//

#include <bits/stdc++.h>

using namespace std;
using ll = long long;
using vi = vector<int>;

void setIO(string s)
{ //this function is the template that redefines the standard IO
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    freopen((s + ".in").c_str(), "r", stdin);
    freopen((s + ".out").c_str(), "w", stdout);
}

struct moun
{
    int x;
    int y;
};

bool comp(moun m, moun n)
{
    if ((m.x - m.y) == (n.x - n.y))
    {
        return m.y > n.y;
    }
    return (m.x - m.y) < (n.x - n.y);
}

int main()
{
    // setIO("repeater");
    setIO("mountains");

    //---------------------BEGIN---------------------//

    int n;
    cin >> n;
    vector<moun> range;
    for (int i = 0; i < n; i++)
    {
        int x;
        cin >> x;
        int y;
        cin >> y;
        struct moun m = {x, y};
        range.push_back(m);
    }

    sort(range.begin(), range.end(), comp);

    int ans = 0;

    int greatest_rc = 0;

    for (moun m : range)
    {
        int cur_rc = (m.x + m.y);
        if (cur_rc != greatest_rc)
        {
            greatest_rc = max(greatest_rc, cur_rc);
            if (cur_rc >= greatest_rc)
            {
                ans++;
            }
        }
    }

    cout << ans << endl;

    return 0;
}
