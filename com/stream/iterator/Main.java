public class Main {
  public static void main(String[] args) {
    BookShelf bookShelf = new BookShelf(4);
    bookShelf.appendBook(new Book("Book 1"));
    bookShelf.appendBook(new Book("Book 2"));
    bookShelf.appendBook(new Book("Book 3"));
    bookShelf.appendBook(new Book("Book 4"));
    Iterator it = bookShelf.iterator();
    while(it.hasNext()) {
      Book book = (Book) it.next();
      System.out.println(book.getName());
    }
  }
}
