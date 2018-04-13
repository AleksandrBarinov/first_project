package fourthMass;

public class massFourth {
    public static void main(String[] args) {
        // объявление массива и заполнение его случайными числами + вывод на экран
        int[] nums = new int[20];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = ((int) (Math.random() * 41) - 20); // 41 - это величина диапазона
            System.out.println("№ " + (i + 1) + " = " + nums[i]);
        }

        //**********************************************************************

        //обявление переменных для подсчета максимального отрицательного элемента
        int subMax = 0;
        int subMaxId = 0;
        //цикл для присваивания subMax и subMaxId значения первого полученного отрицательного элемента
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]<0){subMax = nums[i];subMaxId = i; break;}
        }
        //цикл для поиска максимального отрицательного элемента
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]<0 && nums[i]>subMax){subMax = nums[i];subMaxId = i;}
        }
        //вывод на экран максимального отрицательного элемента
        System.out.println("максимальный отрицательный элемент (subMax) № " + (subMaxId+1) + " = " + subMax);

        //**********************************************************************

        //обявление переменных для подсчета минимального положительного элемента
        int aboveMin = 0;
        int aboveMinId = 0;
        //цикл для присваивания aboveMin и aboveMinId значения первого полученного отрицательного элемента
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>0){aboveMin = nums[i];aboveMinId = i; break;}
        }
        //цикл для поиска минимального положительного элемента
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>0 && nums[i]<aboveMin){aboveMin = nums[i];aboveMinId = i;}
        }
        //вывод на экран минимального положительного элемента
        System.out.println("минимальный положительный элемент (aboveMin) № " + (aboveMinId+1) + " = " + aboveMin);

        //**********************************************************************

        //меняю их местами
        System.out.println("-----------------------------------------------------");
        System.out.println("теперь меняю элементы (subMax) и (aboveMin) и местами");
        nums[subMaxId] = aboveMin;
        nums[aboveMinId] = subMax;
        System.out.println("-----------------------------------------------------");
        //вывожу на экран после изменения
        for (int i = 0; i < nums.length; i++){
            //отдельно выделяю из списка subMax
            if (nums[i] == subMax && i == aboveMinId)
            {System.out.println("№ " + (i + 1) + " = " + nums[i] + " subMax");} else
                //отдельно выделяю из списка aboveMin
                if (nums[i] == aboveMin && i == subMaxId)
                {System.out.println("№ " + (i + 1) + " = " + nums[i] + " aboveMin");} else
                    //вывод всех остальных значений
                    {System.out.println("№ " + (i + 1) + " = " + nums[i]);}
                    }
        }
}