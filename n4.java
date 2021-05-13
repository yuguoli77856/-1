package z10;

public class n4 {
    public static void main(String[] args) {
        int sum = 0;
        int x1;// 公鸡数
        int x2;// 母鸡数
        int x3;// 小鸡数
        for (x1 = 0; x1 <= 20; x1++) {
            for (x2 = 0; x2 <= (100 - 5 * x1) / 3; x2++) {
                x3 = 100 - x1 - x2;
                if ((100 - x1 - x2) % 3 == 0 && 100 - 5 * x1 - 3 * x2 >= 0
                && x3 == (100 - 5 * x1 - 3 * x2) * 3) {
                    sum = sum + 1;
                    System.out.println("公鸡数："+x1 + " 母鸡数：" + x2 + " 小鸡数：" + x3);
                }
            }
        }
        System.out.println("算法一共有"+sum+"种");//显示算法总数
    }
}