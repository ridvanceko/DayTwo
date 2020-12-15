public class TaskTwo {

    public static void main(String [] args) {

         int result = 4*7+3-2*9%5/3-2;          //multiplication, division, module will be executed
                                                // before the addition and subtraction.

        //4*7 will be executed first = 28
        //2*9 = 18 and 18%5 = 3
        //3-3 = 0
        //3-1 = 1
        //28 / 1 = 28

               System.out.println(result);

               int result1 = 12-3/3+4-2*2%4+12%3/3;

   //when we have same level of precedence the code must be executed left to right


         int result2 = 12-3/3+4-((2*2)%4)+((12%3)/3);
        //If we want we can change priority with parentheses

        System.out.println(result1);
        System.out.println(result2);

    }
}
