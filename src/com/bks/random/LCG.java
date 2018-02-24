package com.bks.random;

public class LCG {
	/**
	 * 	<<:逻辑左移
	 * 例: 3<<2	= 12
	 * 	1：	(3)10 = (11)2		先把3转为二进制
	 *  2：	(1100)2				左移2位
	 *  3：	(1100)2 = (12)10	转为10进制
	 */
    private static final int MAXN =1 <<20;
    private int[] x;
    
    public LCG() {
        x =new int[MAXN];
    }
    
    public void rand() {
        x[0] =(int)(Math.random()*100 +1);  // 随机种子(可以用日期产生)
        /* 保证m与a互质 */
        int m =MAXN;
        int a =9;  // a = 4p + 1
        int b =7;  // b = 2q + 1

        System.out.println("种子" + x[0]);
        /* 取1k个数*/
        for(int i =1; i <1000; i++) {
            x[i] =( a * x[i-1] + b) % m;	//a为"乘数"，b为"增量"，m为"模数",x0为"种子数"
            System.out.print(x[i] +"  ");

            if(i %10 ==0) {
            	System.out.println();
            }
        }
    }
    
    public static void main(String[] args) {
        LCG lcg = new LCG();
        lcg.rand();
    }
}