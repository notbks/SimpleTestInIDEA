package com.bks.random;
/**
 * 梅森旋转算法
 * @author whj82
 *
 */
public class MersenneTwister {
	//存储状态
	private int [] MT = new int[624];
	private int idx;
	private boolean isInitialized = false;

	//传种子
	private void msInit(int seed) {
		int i;
		int p;
	    idx = 0;
	    MT[0] = seed;
	    for (i=1; i < 624; ++i) { 		//遍历
	        p = 1812433253 * (MT[i-1] ^ (MT[i-1] >> 30)) + i;
	        MT[i] = p & 0xffffffff; 	//获取p的后32位
	    }
	    isInitialized = true;
	}
	
	private int msRand() {
	    if (!isInitialized){
	    	return 0;
	    }
	    	

	    if (idx == 0)
	        msRenerate();

	    int y = MT[idx];
	    y = y ^ (y >> 11);
	    y = y ^ ((y << 7) & (int)2636928640l);
	    y = y ^ ((y << 15) & (int)4022730752l);
	    y = y ^ (y >> 18);

	    idx = (idx + 1) % 624;
	    return y;
	}
	 
	private void msRenerate() {
	    int i;
	    int y;
	    for (i = 0; i < 624; ++i) {
	        y = (MT[i] & 0x80000000) + 
	                (MT[(i+1) % 624] & 0x7fffffff);
	        MT[i] = MT[(i + 397) % 624] ^ (y >> 1);
	        if (y % 2 != 0) { 
	            MT[i] = MT[i] ^ (int)(2567483615l);
	        }
	    }
	}
	
	//随机种子
	public void rseed(int seed){
		if(isInitialized){
			return ;
		}
		msInit(seed);
	}
	
	//随机值
	public int rand(){
		if(isInitialized == false){
			return 0;
		}
		return msRand();
	}
	
	public MersenneTwister(int seed){
		rseed(seed);
	}
}
