/**
*Aggregate是一个集合接口，容器一般都要实现这个接口，Iterator是迭代器接口，使用它遍历容器中的内容
*Aggregate与Iterator的关系就是关联关系，Aggregate会创建一个Iterator。
*BookShelf实现Aggregate的接口，BookShelfIterator实现Iterator接口
*/
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
