@Entity
public class Order {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne private User user;
    @ManyToMany private List<Product> products;
    private double totalAmount;
    private LocalDate orderDate;
    // Getters and Setters
}
