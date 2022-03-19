import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.ToIntFunction;

public class ArrayLearn {
    public static int[] arr = {1,2,3,4,5};
    public static int[] arrToCompare = {1,2,7,4,5};
    public static void ToPrint(int[] arr){

        for (int i = 0; i <arr.length ; i++) {
            System.out.println ("" + arr[i]);
        }}
    public static void Task2()
        {
        /*
        Эта опция позволяет Вам, например, разделить группы цифр в числовых литералах, которые могут улучшить удобочитаемость Вашего кода.
        Например, если Ваш код содержит числа со многими цифрами, можно использовать символ подчеркивания,
        чтобы разделить цифры в группах три, подобный тому, как Вы использовали бы знак препинания как запятая, или пространство, как разделитель.
        Можно поместить подчеркивания только между цифрами; невозможно поместить подчеркивания в следующие места:
            Вначале или конец числа
            Смежный с десятичной точкой в литерале с плавающей точкой
            До F или L суффикс
            В позициях, где строка цифр ожидается
         */
         long __long__, __long1__; int __int__, __int1__; float __float__, __float1__;

         __long__ = 0xFF_EC_DE_5e; __long1__ = 0xFFECDE5e;
         System.out.println(__long__);
         System.out.println(__long1__);
         __int__ = 12_34_21_21; __int1__ = 12342121;
         System.out.println(__int__);
         System.out.println(__int1__);
         __float__ =2.12_34_12F; __float1__=2.123412F;
         System.out.println(__float__);
         System.out.println(__float1__);
        }
    public static void main(String[] args) {

        System.out.println("_________________________________");
        //Arrays.copyOf Создать копию массива arr
        int arr2[] = Arrays.copyOf(arr, 5);
            System.out.println("Arrays.copyOf");
            ToPrint(arr2);
        System.out.println("_________________________________");
        // Arrays.copyOfRange Возвращает копию массива новой длины, при этом копируется часть оригинального массива от начального индекса до конечного -1
        int arr3[] = Arrays.copyOfRange(arr,0,2);
            System.out.println("Arrays.copyOfRange");
            ToPrint(arr3);
        System.out.println("_________________________________");
        //Arrays.binarySearch Ищет и Возвращает индекс искомого значения в массиве
        int BinSearchInt = Arrays.binarySearch(arr, 4);
            System.out.println("Arrays.binarySearch");
            System.out.println("Индекс "+ BinSearchInt);
        System.out.println("_________________________________");
        //Arrays.compare Сравнивает значения массивов, если они одинаковы - возвращает 0, если отличаются - 1
        int CompareInt = Arrays.compare(arrToCompare,arr);
            System.out.println("Arrays.compare");
            System.out.println("Вывод сравнения: "+CompareInt);
        System.out.println("_________________________________");
        /*Arrays.compareUnsigned Проверяет целочисленные ли значения в 1 массиве
        Возвраты:
        значение 0 если x == y; значение меньше, чем 0 если x < y как неподписанные значения;
        и значение, больше, чем 0 если x > y как неподписанные значения
        хз зачем оно нужно, но ладно*/
        int UnsignedIntCompare = Arrays.compareUnsigned(arr,arrToCompare);
            System.out.println("Arrays.compareUnsigned");
            System.out.println(UnsignedIntCompare);
        System.out.println("_________________________________");
        //Arrays.deepEqualsСравнивает соответствуют ли значения многомерных массивов, если да - возвращает true, если нет - false
        boolean BooleanDeapEquals= Arrays.deepEquals(new int[][]{arr}, new int[][]{arr2});
            System.out.println("Arrays.deepEquals");
            System.out.println(BooleanDeapEquals);
        System.out.println("_________________________________");
        //Arrays.deepHashCode Returns a hash code based on the "deep contents" of the specified array. э?
        int BooleanHashCode = Arrays.deepHashCode(new int[][]{arr});
            System.out.println("Arrays.deepHashCode");
            System.out.println(BooleanDeapEquals);
        System.out.println("_________________________________");
        //Arrays.deepToString  Возвращает контент массива стрингой
        String DeeptoString = Arrays.deepToString(new int[][]{arr});
            System.out.println("Arrays.deepToString");
            System.out.println(DeeptoString);
        System.out.println("_________________________________");
        //Arrays.equals Сравнивает два массива
        boolean Equals = Arrays.equals(arr, arrToCompare);
            System.out.println("Arrays.equals");
            System.out.println(Equals);
        System.out.println("_________________________________");
        //Arrays.fill Заполняет массив заданным значением
        Arrays.fill(arr2, 1);
            System.out.println("Arrays.fill");
            ToPrint(arr2);
        System.out.println("_________________________________");
        //Arrays.hashCode возвращает значение хэшкода массива
        int ArraysHashCode = Arrays.hashCode(arr);
            System.out.println("Arrays.hashCode");
            System.out.println(ArraysHashCode);
        System.out.println("_________________________________");
        //Arrays.parallelSort - параллельная Сортировка значений массива по восхождению
        Arrays.parallelSort(arrToCompare);
            System.out.println("Arrays.parallelSort");
            ToPrint(arrToCompare);
        System.out.println("_________________________________");
        //Arrays.sort  - сортировка массива
        arrToCompare = new int[]{1, 5, 6, 2, 8};
        Arrays.sort(arrToCompare);
            System.out.println("Arrays.sort");
            ToPrint(arrToCompare);
        System.out.println("_________________________________");
        //Arrays.Spliterator - возвращает интерфейс типа сплиттератор со значениями из массива
        Arrays.spliterator(arr);
            System.out.println("Arrays.splitterator");
            System.out.println(Arrays.spliterator(arr));
        System.out.println("_________________________________");
        //Arrays.stream - возвращает стрим со значениями из массива
        Arrays.stream(arrToCompare);
            System.out.println("Arrays.stream");
            System.out.println(Arrays.stream(arrToCompare));
        System.out.println("_________________________________");
        // Arrays.toString - Возвращает значения массива в виде стринги
        String ConvToStr = Arrays.toString(arrToCompare);
        System.out.println(ConvToStr);
        System.out.println("_________________________________");
        //Arrays.parallelPrefix -не особо понял чё это:(
        //Arrays.parallelSetAll -не особо понял чё это:(
        // Arrays.setAll(arrToCompare, IntUnaryOperator(10)); -не особо понял чё это:(
        Task2();
    }

}
