class Solution {
public:
    void rotate(vector<vector<int>>& matrix) {
    int n  = matrix.size(); 
    map<pair<int,int>,int>m;
    map<pair<int,int>,int>a;
    for(int i =0;i<n;i++)
    {
        for(int j =0;j<n;j++)
        {
            if(m[{i,j}]!=1 and m[{j,i}]!=1)
            {
              swap(matrix[i][j], matrix[j][i]);
              m[{i,j}]=1;
              m[{j,i}]=1;
            }
        }
    }
    for(int i =0;i<n;i++)
    {
        for(int j =0;j<n;j++)
        {
            if(a[{i,j}]!=1)
            {
              swap(matrix[i][j], matrix[i][n-1-j]);
              a[{i,n-1-j}]=1;
            }
        }
    }
    }
