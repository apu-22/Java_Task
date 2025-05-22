package Practice_Problem6;

class Book {
    public int id;
    public String title;
    public String author;
    public String publishedYear;
    public float cost;
    public String availability;

    public Book(int id, String title, String author, String publishedYear, float cost, String availability) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publishedYear = publishedYear;
        this.cost = cost;
        this.availability = availability;
    }

    public void addBookEntry() {
        System.out.println("Add new Books");
    }

    public void removeBookEntry() {
        System.out.println("Books delete");
    }

    public void showDetails() {
        System.out.println(this.title + " author " + this.author + " id " + this.id);
    }
}

class Librarian {
    public int empId;
    public String empName;

    public Librarian(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    public void findBook(Book book) {
        book.showDetails();
    }

    public void confirmUser(User user) {
        System.out.println("Verify");
        System.out.println("Name is : " + user.name);
    }

    public void placeOrder(Book book, User user) {
        System.out.println("Order details is :");
        System.out.println("user :");
        user.displayUser();
        System.out.println("book details :");
        book.showDetails();
    }

    public void processSale(Book book, User user) {
        System.out.println("sell details is :");
        System.out.println("user :");
        user.displayUser();
        System.out.println("book details :");
        book.showDetails();
    }
}

class User {
    public String id;
    public String name;
    public String address;
    public int contact;

    public User(String id, String name, String address, int contact) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.contact = contact;
    }

    public void giveBackBook(Book book) {
        System.out.println("return book Detais");
        book.showDetails();
    }

    public void calculateFine(int lateDays, int dailyRate) {
        int totalFine = lateDays * dailyRate;
        System.out.println("fine is " + totalFine);
    }

    public void registerUser() {
        System.out.println("add user");
    }

    public void removeUser() {
        System.out.println("delete user");
    }

    public void modifyUserName(String updatedName) {
        this.name = updatedName;
    }

    public void purchaseBook(Book book) {
        System.out.println("Purchase Book details is: ");
        book.showDetails();
    }

    public void displayUser() {
        System.out.println("Name : " + this.name);
        System.out.println("Address : " + this.address);
        System.out.println("Id : " + this.id);
        System.out.println("phoneNo : " + this.contact);
    }

    public void showPublisher(Publisher publisher) {
        publisher.displayPublisher();
    }
}

class Publisher {
    public int pubId;
    public String pubName;
    public String pubAddress;
    public int pubContact;

    public Publisher(int pubId, String pubName, String pubAddress, int pubContact) {
        this.pubId = pubId;
        this.pubName = pubName;
        this.pubAddress = pubAddress;
        this.pubContact = pubContact;
    }

    public void displayPublisher() {
        System.out.println("PublisherDetails is: ");
        System.out.println("id " + pubId);
        System.out.println("name : " + pubName);
        System.out.println("address : " + pubAddress);
    }

    public void checkOrderStatus(Book book) {
        System.out.println("Order status checked for book: " + book.title);
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Book b1 = new Book(101, "Java", "James Gosling", "1995", 499.99f, "Available");
        User u1 = new User("U001", "APU", "Naogaon", 1234567890);
        Librarian l1 = new Librarian(1, "LB");
        Publisher p1 = new Publisher(201, "TechBooks", "Mohakhali", 987654321);

        l1.findBook(b1);
        l1.confirmUser(u1);
        l1.placeOrder(b1, u1);
        l1.processSale(b1, u1);

        u1.giveBackBook(b1);
        u1.purchaseBook(b1);
        u1.showPublisher(p1);
        u1.calculateFine(3, 10);

        p1.checkOrderStatus(b1);
    }
}
