public class thirty_six_string_buffer 
{

    public static void main(String args[])
    {
        StringBuffer sb = new StringBuffer("Navin");
        System.out.println(sb.capacity());
        
        System.out.println(sb.length());

        sb.append(" Reddy");
        System.out.println(sb);

        //String str =sb; error can not convert stringbuffer to string

        //length and capacity are two different things 
        String str = sb.toString();

        sb.deleteCharAt(2);

        sb.insert(0,"java");

        //stringbuffer - thread safe 
        //string builder - not thread safe 
    }
}
