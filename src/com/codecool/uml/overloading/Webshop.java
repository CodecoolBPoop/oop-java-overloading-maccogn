package com.codecool.uml.overloading;

public class Webshop {

    public static void main(String[] args) {
	// write your code here
        Supplier nike = new Supplier("Nike","Biggest sportswear company");
        System.out.println(nike.toString());
        nike.setDescription("A Nike, Inc. vagy röviden Nike a világ első számú edzőcipő-, sportruházat- és sportszergyártója. Az amerikai székhelyű vállalatot Nikéről, a győzelem görög istennőjéről nevezték el. Termékeit a Nike, Cortez, Nike Golf, Nike Pro, Air Jordan, Team Starter, valamint leányai márkanevei alatt forgalmazza.");
        System.out.println(nike.toString());

    }
}
