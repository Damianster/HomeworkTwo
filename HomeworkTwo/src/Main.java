import java. util. Scanner;

public class Main {
    public static void main(String[] args) {
        int size = 1000;
        int n = 1;
        int j=0;
        int i = 0;
        int k;
        String b = "" ;
        Employee[] tab = new Employee[size];
        Scanner read = new Scanner(System.in);
        do {for(i=0;i<tab.length;i++){

            System.out.println("\nCreate company E-mail address for new employee \n");
            System.out.println("Enter your name:");
            String name1 = read.nextLine();
            System.out.println("Enter your surname:");
            String surname1 = read.nextLine();
            tab[i] = new Employee();
            tab[i].name = name1;
            tab[i].surname = surname1;
            System.out.println("\nYour Email address is:");

            b = (tab[i].surname.toLowerCase() + "." + tab[i].name.toLowerCase()  + "@mex.com");

            for(j=0,k=1;j<i;j++) {

                if ((tab[i].surname.equals(tab[j].surname)) && (tab[i].name.equals(tab[j].name))) {

                    b = (tab[i].surname.toLowerCase() + "." + tab[i].name.toLowerCase() + (k) + "@mex.com");
                    k++;
                }
            }

            System.out.println(b);
            System.out.println("\nAdd one more employee Email? - (y/n)");
            String choice = read.nextLine();
            if (choice.equals("n")) {
                System.out.println("Close the program? - (y/n)");
                String choice1 = read.nextLine();
                if (choice1.equals("y")) {
                    n = 0;
                    System.out.println("Koniec");
                }


            }}


        }
        while (n == 1) ;

    }
}
