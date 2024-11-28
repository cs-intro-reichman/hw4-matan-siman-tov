public class Primes {
    public static void main(String[] args) {
        final int n = Integer.parseInt(args[0]);
        boolean [] arr = new boolean[n+1];
        for (int i = 2; i<n+1; i++) arr[i]=true;
        int p=2;
        while (p <= Math.sqrt(n))
        {
            for (int i = p+p; i<n+1; i=i+p){
                arr[i]=false;
            } 
            for (int i = p+1; i<n+1; i++) {
                if(arr[i]){
                    p=i;
                    i=n+1;
                }
            }
        }
        int count=0;
        for (int i = 2; i<n+1; i++) {
            if (arr[i]){
                count++;
                System.out.println(i);
            }
        }
        System.out.println("There are "+count+" primes between 2 and "+n+". ("+(count*100/(n))+"% are primes)");
    }
}