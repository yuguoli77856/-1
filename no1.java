package z10;

public class no1 {
    public static void main(String[] args) {
        //每个年级的平均分
        int s[][]={{99,68,97},{89,95,88,59,64},{89,79,99,58}};
        double sum=0,count=0;
        for(int i=0;i<s.length;i++){
            count=count+s[i].length;
            for (int j=0;j<s[i].length;j++){
                sum+=s[i][j];
            }
        }
        double avy=sum/count;
        System.out.println("全年级平均分："+avy);
    }
    
}