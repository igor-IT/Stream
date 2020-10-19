package Collect;

import java.util.Arrays;

public enum EnumStat {

    JUN(100, 10000),
    MID(11000, 20000 ),
    SEN(21000, 50000);

    private final int min;
    private final int max;

    EnumStat(int min, int max){
        this.max = max;
        this.min = min;
    }

    public static EnumStat findDySalary(int salary){
      return   Arrays.stream(values()).filter(f->f.min <= salary).filter(f2-> f2.max >= salary).findFirst().get();
    }
}
