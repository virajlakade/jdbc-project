package org.viraj.jdbcprojectforjggmasalas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.viraj.jdbcprojectforjggmasalas.model.Masala;
import org.viraj.jdbcprojectforjggmasalas.service.MasalaService;

import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class JdbcprojectForJggMasalasApplication {

    public static void main(String[] args) {

        ApplicationContext context =
                SpringApplication.run(JdbcprojectForJggMasalasApplication.class, args);

        MasalaService service = context.getBean(MasalaService.class);
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== JayGagangiri Masala System =====");
            System.out.println("1. Add Masala");
            System.out.println("2. View All Masala");
            System.out.println("3. View Masala By ID");
            System.out.println("4. Delete Masala");
            System.out.println("5. Update Masala");
            System.out.println("6. Exit");
            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.println("Enter How many masala you want to add");
                    int n= sc.nextInt();
                    for (int i = 0; i < n; i++) {
                        Masala m = context.getBean(Masala.class);


                        sc.nextLine();
                        System.out.print("Enter Name: ");
                        m.setNameofm(sc.nextLine());

                        System.out.print("Enter Quantity in 10gm: ");
                        m.setIn10gm(sc.nextDouble());

                        System.out.print("Enter Price: ");
                        m.setPrice(sc.nextDouble());

                        service.addMasala(m);
                        System.out.println("Masala Added Successfully!");
                    }
                    break;

                case 2:
                   /* List<Masala> list = service.getallmasala();
                    for (Masala masala : list) {
                        System.out.println("--------------------------------");
                        System.out.println("ID: " + masala.getId());
                        System.out.println("Name: " + masala.getNameofm());
                        System.out.println("10gm: " + masala.getIn10gm());
                        System.out.println("Price: " + masala.getPrice());}*/
                         System.out.println("See in the Database jGGDB");

                    break;

                case 3:
                    System.out.print("Enter ID: ");
                    Long id = sc.nextLong();
                    Masala found = service.getMasalabyId(id);

                    if (found != null) {
                        System.out.println("Name: " + found.getNameofm());
                        System.out.println("10gm: " + found.getIn10gm());
                        System.out.println("Price: " + found.getPrice());
                    } else {
                        System.out.println("Masala Not Found!");
                    }
                    break;

                case 4:
                    System.out.print("Enter ID to delete: ");
                    Long delId = sc.nextLong();
                    service.deleteStudent(delId);
                    System.out.println("Deleted Successfully!");
                    break;

                case 5:
                    System.out.print("Enter ID to update: ");
                    Long upId = sc.nextLong();

                    Masala updateMasala = service.getMasalabyId(upId);

                    if (updateMasala != null) {

                        sc.nextLine();
                        System.out.print("Enter New Name: ");
                        updateMasala.setNameofm(sc.nextLine());

                        System.out.print("Enter New 10gm Quantity: ");
                        updateMasala.setIn10gm(sc.nextDouble());

                        System.out.print("Enter New Price: ");
                        updateMasala.setPrice(sc.nextDouble());

                        service.updateMasala(updateMasala);
                        System.out.println("Updated Successfully!");
                    } else {
                        System.out.println("Masala Not Found!");
                    }
                    break;

                case 6:
                    System.exit(0);
            }
        }
    }
}