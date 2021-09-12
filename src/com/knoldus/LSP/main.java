package com.knoldus.LSP;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class main {
    public static void main(String[] args) {
        List<Member> myList = new ArrayList<Member>();

        myList.add(new LifetimeMember("Kchitiz",new Date()));
        myList.add(new AnnualMember("Deep",new Date()));
        myList.add(new EnquiryUser("Knolder"));
        for (Member c: myList){
            c.addToDatabase();
        }
    }

}
