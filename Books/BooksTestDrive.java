public class BooksTestDrive {
    public static void main(String[] args){
        int x = 0;
        Books[] myBooks = new Books[3];
        myBooks[0] = new Books();
        myBooks[1] = new Books();
        myBooks[2] = new Books();
        myBooks[0].title = "First book of Java";
        myBooks[1].title = "Hall of Java";
        myBooks[2].title = "Best of Java";
        myBooks[0].author = "Sergey Bondarenko";
        myBooks[1].author = "Helen Bondarenko";
        myBooks[2].author = "Bohdan Marsenyuk";

        while(x < myBooks.length){
            System.out.print(myBooks[x].title);
            System.out.print(" by ");
            System.out.println(myBooks[x].author);
            x += 1;
        }
    }
}
