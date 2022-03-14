# JavaClassWork-CodeWars-
**Задача 1:   Вернуть список степеней двойки от 0 до n включительно**\
Мое решение:


	public static long[] powersOfTwo(int n) {
            long[] result = new long[n + 1];
            for (int i = 0; i <= n; i++) {
                result[i] = (long) Math.pow(2, i);
            }
            return result;
        }
        
				
Лучшее решение: 


	static long[] powersOfTwo(int n) {
    return rangeClosed(0, n).map(i -> (long) Math.pow(2, i)).toArray();
  	}
	
	
**Задача 2: Числовое значение сделать строковым**\
Единственное решение:

	public static String numberToString(int num) {
        return Integer.toString(num);
    }
		
		
**Задача 3: Вернуть количество нечетных чисел, меньших заданного n.**


Мое решение:


		public static int oddCount(int n) {
        if (n % 2 == 0) {
            return n / 2;
        } else {
            return (n - 1) / 2;
        }
    }
		
Лучшее решение:


		static int oddCount(int n) {
    return n / 2;
	}
		
		
**Задача 4: Даны числа a и b (a<b). Построить массив из чисел по возрастанию от a до b включительно**\
Мое решение: 

		public static int[] between(int a, int b) {
        int[] result = new int[b-a+1];
        for(int i = a; i<=b;i++){
            result[i-a]=i;
        }
        return result;
    }
		
Лучшее решение: 

		import static java.util.stream.IntStream.rangeClosed;

		interface Kata {
			static int[] between(int a, int b) {
				return rangeClosed(a, b).toArray();
			}
		}
		
		
	
	
	

				
