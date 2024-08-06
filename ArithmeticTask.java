public class ArithmeticTask {
    public static void main(String[] args) {
        

        int fnam = 3;
        int Snam = 4;
        
        int Lnam = fnam + Snam;   /*Postive  7*/
        System.out.println(Lnam);

        int  L2nam = Lnam - 3;
        System.out.println( L2nam); /* Minus 4 */

        int L3 = L2nam * 3;
        System.out.println(L3); /*Mulitply 12 */

        int L4 = L3 / 2 ;
        System.out.println(L4); /*Divid  6*/


        L4 = L4 + 3 ;
        L4 = L4 % 4 ;
        System.out.println(L4); 


    }
}
