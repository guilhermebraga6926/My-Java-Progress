public class ParameterScope 
{
    public static void main(String[] args)
    {
       int min = 1;
       int max =99;
       int numero = getRandomNumer(min, max); // numero recebe - função que ge 
       System.out.println(numero); // printa o numero na tela
    }


    public static int getRandomNumer(int min, int max)
    {
        return (int)(Math.random()*(max - min +1)) + min; 

}
}