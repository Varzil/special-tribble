package Code;

import java.io.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.StringTokenizer;

/*
Chef wants to make a purchase. For this, he needs X
 gold coins, but he has none at the moment.

Chef has N
 fixed deposits, the ith
 of which is worth Ai
 coins. He wants to open the minimum number of these deposits so that he has at least X
 coins.

You have to tell Chef the minimum number of fixed deposits he must open in order to have X
 coins, or say that this is impossible.

INPUT FORMAT:
==> The first line of input contains a single integer T
, denoting the number of test cases. The description of T
 test cases follows.

==> The first line of each test case contains two space-separated integers — N
and X as described in the statement.

==> The second line of each test case contains N
 space-separated integers — the ith
 of which is Ai

*/

class FastReader
{
    BufferedReader br;
    StringTokenizer st;

    public FastReader()
    {
        br = new BufferedReader(new
                InputStreamReader(System.in));
    }

    String next()
    {
        while (st == null || !st.hasMoreElements())
        {
            try
            {
                st = new StringTokenizer(br.readLine());
            }
            catch (IOException  e)
            {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    int nextInt()
    {
        return Integer.parseInt(next());
    }

    long nextLong()
    {
        return Long.parseLong(next());
    }

    double nextDouble()
    {
        return Double.parseDouble(next());
    }

    String nextLine()
    {
        String str = "";
        try
        {
            str = br.readLine();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return str;
    }
}



class MINFD
{
    public static void main (String[] args)
    {
        try{
            OutputStream outputStream =System.out;
            PrintWriter out =new PrintWriter(outputStream);
            FastReader input =new FastReader();
            int t=input.nextInt();
            while(t-->0){
                int n=input.nextInt();
                int x=input.nextInt();
                int[] arr =new int[n];

                int sum=0;
                for(int i=0;i<n;i++)
                    arr[i]=input.nextInt();

                Arrays.sort(arr);
                boolean flag=false;

                for(int i=arr.length-1;i>=0;i--){

                    sum+=arr[i];
                    if(sum>=x)
                    {
                        flag=true;
                        System.out.println(arr.length-i);
                        break;
                    }
                }
                if(!flag)
                    System.out.println(-1);
            }
        }catch(Exception ignored){
        }

    }
}

