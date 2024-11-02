public class eighty_two_ducking {
    public static void main(String args[])
    {

    }
}


//
/*
 * d() throws exception
 * {
 * critical stmt 
 * try{}
 * catch()
 * }
 * 
 * 
 * e() throws exception 
 * {
 * critical stmt
 * try{}
 * catch{}
 * }
 * 
 * 
 * c()
 * {
 * d();
 * e();
 * }
 * 
 * both d and e have the same exception
 * instead of hadnling try catch in both d and e , can't we handle it in c() itself?
 * 
 */