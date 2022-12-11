package Inheritence;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class MainApp3 {
    public static void main(String[] args) {
        PermanentEmployee p1=new PermanentEmployee();
        p1.details(10,2500);
        p1.displayDesignation("HR");
        p1.details(20,3000);
        p1.displayDesignation("MANAGER");

        System.out.println("======================================");

        ContractEmployee c1=new ContractEmployee();
        c1.details(30,1500);
        c1.displayContractDetails(3);
        c1.details(40,1800);
        c1.displayContractDetails(2);
    }
}
