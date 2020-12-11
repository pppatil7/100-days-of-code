package com.project;

class SubServiceProvider extends ServiceProvider {
   
   public static void main(String[] args) {
	Service s1=new Service();
	s1.property(10);
	ServiceProvider s2=new ServiceProvider();
	s2.property(10);
	Service s3=new ServiceProvider();
	s3.property(10);
}
	
}
