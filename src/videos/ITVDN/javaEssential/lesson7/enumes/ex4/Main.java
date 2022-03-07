package videos.ITVDN.javaEssential.lesson7.enumes.ex4;

public class Main {
    public static void main(String[] args) {
        Company company = Company.SKYNET;
        System.out.println(company);

        int salary = company.getValue();
        String currency = company.getCurrency();
        System.out.println(salary+ " " + currency);
    }
}
