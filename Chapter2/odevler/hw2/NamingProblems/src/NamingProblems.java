/**
 * Bolum 3 - Odev 2
 * duzeltilen isimler yorumlarda belirtilmistir
 */
public class NamingProblems {

    String firstName; // first_name

    int calculatePower(int base, int exponent) { //f, x, y
        int power = 1; //z
        for (int i = 0; i < exponent; i++) {
            power = power * base;
        }
        return power;
    }

    public static void main(String[] args) {
        NamingProblems namingErrors = new NamingProblems(); //naming_errors
        int base = 2; //base_var, baseVar de olabilir
        int exponent = 10; //exp_var, expVar da olabilir
        
        int power = namingErrors.calculatePower(base, exponent); //base_var_of_pow_exp_var, baseVarOfPowExpVar de olabilir
        System.out.println(base + " to the " + exponent + " is " + power);
        System.out.println(base + " ^ " + exponent + " is " + power);
    }
}
