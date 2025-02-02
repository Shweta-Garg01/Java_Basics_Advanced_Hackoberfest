package lec18;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RecursiveTask;

public class Generate_Parentheses
{
    public static void main(String[] args) {
        int n=3;
        List<String> list = new ArrayList<>();
        GenerateParentheses(n,0,0,"",list);
    }
    public static void GenerateParentheses(int n, int open, int close, String ans, List<String> list)
    {
        if(open==n && close==n)
        {
            //System.out.println(ans);
            list.add(ans);
            return;
        }
        if(open<n)
        {
            GenerateParentheses(n,open+1,close, ans+"(", list);

        }
        if(close<open)
        {
            GenerateParentheses(n, open, close+1,ans+")", list);
        }

    }
}
