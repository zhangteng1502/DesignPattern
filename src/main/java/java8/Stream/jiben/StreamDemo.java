package java8.Stream.jiben;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamDemo {

    public static void main(String[] args) {
        List<Author> authors = getAuthors();
        authors.stream()
                .distinct()
                .filter(author -> author.getAge()<22)
                .forEach(author -> System.out.println(author.getName()));
        //System.out.println(authors);
    }
    private static List<Author> getAuthors() {
        Author author1 = new Author(1L, "杨杰炜",18, "my introduction 1",  null);
        Author author2 = new Author(2L, "yjw",19, "my introduction 2",  null);
        Author author3 = new Author(2L, "yjw", 19,"my introduction 2", null);
        Author author4 = new Author(4L, "wdt", 29,"my introduction 4",  null);
        Author author5 = new Author(5L, "wtf", 12,"my introduction 5",  null);

        List<Book> books1 = new ArrayList<>();
        List<Book> books2 = new ArrayList<>();
        List<Book> books3 = new ArrayList<>();

        // 上面是作者和书
        books1.add(new Book(1L, "类别,分类啊", "书名1", 45, "这是简介哦"));
        books1.add(new Book(2L, "高效", "书名2", 84, "这是简介哦"));
        books1.add(new Book(3L, "喜剧", "书名3", 83, "这是简介哦"));

        books2.add(new Book(5L, "天啊", "书名4", 65, "这是简介哦"));
        books2.add(new Book(6L, "高效", "书名5", 89, "这是简介哦"));

        books3.add(new Book(7L, "久啊", "书名6", 45, "这是简介哦"));
        books3.add(new Book(8L, "高效", "书名7", 44, "这是简介哦"));
        books3.add(new Book(9L, "喜剧", "书名8", 81, "这是简介哦"));

        author1.setBooks(books1);
        author2.setBooks(books2);
        author3.setBooks(books2);
        author4.setBooks(books3);
        author5.setBooks(books2);

        return new ArrayList<>(Arrays.asList(author1, author2, author3, author4, author5));
    }

}
