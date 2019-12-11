https://www.spoj.com/problems/TRUCKL/

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        String n;
        while ((n=br.readLine())!=null&&!n.equals("")){
            StringTokenizer st= new StringTokenizer(n);
            int crates = Integer.parseInt(st.nextToken());
            int loades = Integer.parseInt(st.nextToken());
            System.out.println(recursion(crates,loades,0));
        }

    }

    private static int recursion(int crates, int loades,int sum) {
        if(crates<=loades)
            return 1;
        else
        {
            if(crates%2==0)
                 sum+=recursion(crates/2,loades,sum)+recursion(crates/2,loades,sum);
            else
                sum+=recursion(crates/2,loades,sum)+recursion(crates/2+1,loades,sum);
        }
        return sum;
    }
}
