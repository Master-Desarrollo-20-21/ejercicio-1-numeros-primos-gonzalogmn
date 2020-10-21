public class PrimeNumbersExercise {

    public static void main(String[] args) {
        // La suma de los números primos que hay entre los 50 primeros números
        final int MAX_VALUE = 50;
        int result = 0;

        for(int i=1; i<=MAX_VALUE; i++) {
            if(isPrime(i)) {
                result += i;
            }
        }

        System.out.println("La suma de los números primos que hay entre los 50 primeros números es " + result);

        // La suma de los 50 primeros números primos
        final int MAX_PRIME_COUNT = 50;
        int primeCount = 0;
        int actualNumber = 1;
        result = 0;

        while(primeCount < MAX_PRIME_COUNT) {
            if(isPrime(actualNumber)) {
                primeCount++;
                result += actualNumber;
            }

            actualNumber++;
        }

        System.out.println("La suma de los 50 primeros números primos es " + result);

    }

    public static boolean isPrime(int number) {
        for(int i=2; i<number; i++) {
            if(number%i==0) {
                return false;
            }
        }
        return true;
    }
}
