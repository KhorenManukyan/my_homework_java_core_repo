package book.shildt.javacore.chapter14.generic2;

public class Stats <T extends Number>{
    T[] nums;
    Stats(T[] nums){
        this.nums = nums;
    }

    double average(){
        double sum = 0.0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i].doubleValue();
        }
        return sum/nums.length;
    }
}
