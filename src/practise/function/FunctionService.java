package practise.function;
import java.util.function.BiFunction;
import java.util.function.Function;





public class FunctionService {
    public String nameUpperCaseFunctionParameter(Function<String,String> upper,String name)
    {
        return upper.apply(name);
    };

    Function<String,String>nameupperCaseFunction =(name) ->
    {

        return  name.toUpperCase();

    };





     public String nameUpperCase(String name)
    {
        return  name.toUpperCase();
    }
    BiFunction<String,String,String> biFunctionConcatFunc =(fName,lName) ->
    {

        return  fName.concat(lName);
    };
    public  static  void main(String[] args)
    {
        FunctionService f1 = new FunctionService();
        String upperCaseName = f1.nameUpperCase("neoteric");
        System.out.println("output from method "+upperCaseName);
        String upperCaseFunction = f1.nameupperCaseFunction.apply("neoteric");
        System.out.println("output from function"+upperCaseFunction);
         String fullName= f1.biFunctionConcatFunc.apply("neoteric", "Method");
         System.out.println("Fullnamefrom Bifunction"+fullName);
         String   nameUpperCaseFunctionAsParameter =
         f1.nameUpperCaseFunctionParameter(
                 f1.nameupperCaseFunction, "neoterickukatpally");
         System.out.println("output of method,which takes function as parameter " +nameUpperCaseFunctionAsParameter);


    }

}
