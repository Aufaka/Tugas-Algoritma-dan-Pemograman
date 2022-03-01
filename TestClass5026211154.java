public class TestClass5026211154 {

    public static void main(String[] args){
            ComputeMethods5026211154 Faka = new ComputeMethods5026211154();
    
            double celcius = Faka.fToC(100);
            System.out.println("100 F = "+ celcius + " C");

            double hypotenuse = Faka.hypotenuse (5,12);
            System.out.println("Hypotenuse = " + hypotenuse);

            int rollDice = Faka.roll();
            System.out.println("Roll 2 Dice Result = " + rollDice);

     }
}

