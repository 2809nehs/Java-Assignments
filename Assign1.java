public class Assign1 {

    public static void main(String[] args) {
        int a=12;
        int b=25;
        int c=48;
        int d=34;
        int res;
        if(a<b && a<c)
        {
            if(a<d)
            {
                res=a;
            }
            else
            {
                res=b;
            }

        }else
        {
            if(b<c)
            {
                res=c;
            }

            else
            {
                res=d;
            }
        }
        System.out.println("The smallest number is "+res);

    }
    }


