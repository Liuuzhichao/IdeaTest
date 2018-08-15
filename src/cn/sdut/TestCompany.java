package cn.sdut;

public class TestCompany {

    public static void main(String[] args) {
        ColaEmployee[] colaEmployee = new ColaEmployee[3];
        colaEmployee[0] = new SalariedEmployee("ll",3,1000);
        colaEmployee[1] = new HourlyEmployee("zz",2,1000,240);
        colaEmployee[2] = new SalesEmployee("cc",1,1000,0.5);
        Company company = new Company();
        company.showSal(colaEmployee[0],3);
        company.showSal(colaEmployee[1],3);
        company.showSal(colaEmployee[2],3);
    }
}
