public class Main {
    public static void main(String[] args) {
        Book[] books = {
                new Book(101, "Java Programming", "James Gosling"),
                new Book(102, "Data Structures", "Mark Allen Weiss"),
                new Book(103, "Clean Code", "Robert C. Martin"),
                new Book(104, "Algorithms", "Thomas H. Cormen")
        };

        System.out.println("🔍 Linear Search: Looking for 'Clean Code'");
        Book foundLinear = SearchUtil.linearSearch(books, "Clean Code");
        System.out.println(foundLinear != null ? foundLinear : "Book not found");

        System.out.println("\n📚 Sorting books for Binary Search...");
        SearchUtil.sortBooksByTitle(books);

        System.out.println("\n🔍 Binary Search: Looking for 'Clean Code'");
        Book foundBinary = SearchUtil.binarySearch(books, "Clean Code");
        System.out.println(foundBinary != null ? foundBinary : "Book not found");
    }
}
