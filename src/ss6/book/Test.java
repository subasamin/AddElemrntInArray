package ss6.book;

import com.sun.source.tree.IfTree;

public class Test {
    public static void main(String[] args) {
        FictionBook b1 = new FictionBook(1, "Fiction1","Codegym",50,"vien tuong 1");
        FictionBook b2 = new FictionBook(1, "Fiction1","Codegym",60,"vien tuong 1");
        FictionBook b3 = new FictionBook(1, "Fiction1","Codegym",70,"vien tuong 1");
        ProgrammingBook b4 = new ProgrammingBook(2,"JavaLanguage", "CodeGym", 70, "Java","English" );
        ProgrammingBook b5 = new ProgrammingBook(2,"JavaLanguage", "CodeGym", 80, "PHP","English" );
        ProgrammingBook b6 = new ProgrammingBook(2,"JavaLanguage", "CodeGym", 90, "C++","English" );
        FictionBook[] booksF = {b1,b2,b3};
        ProgrammingBook[] booksP = {b4,b5,b6};

        double sum = 0 ;
        double sumP = 0 ;
        double sumF = 0 ;
        for (int i = 0; i < booksF.length; i++) {
            sumF +=booksF[i].getPrice();
        }
        for (int i = 0; i < booksF.length; i++) {
            sumP +=booksP[i].getPrice();
        }
        sum = sumF - sumF* FictionBook.getAmount() + sumP-sumP* ProgrammingBook.getAmount();
        System.out.println("Tong tien 6 cuon sach la: " + sum);

        double index = 0;
        for (int i = 0; i < booksP.length; i++) {
            if(booksP[i].getLanguage().equalsIgnoreCase("Java")){
                index++;
            }
        }
        System.out.println("So sach co ngon ngu Java la: " + index);

        double count = 0;
        for (int i = 0; i < booksF.length; i++) {
            if (booksF[i].getCategory().equalsIgnoreCase("vien tuong 1")){
                count++;
            }
        }
        System.out.println("So sach co category vien tuong 1 la: " + count);

        double count1 = 0;
        for (int i = 0; i < booksF.length; i++) {
            if (booksF[i].getPrice()<100){
                count1++;
            }
        }
        System.out.println("So sach fiction co gia nho hon 100 la: "+count1);

    }
}
