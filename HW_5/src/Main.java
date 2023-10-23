public class Main {
    public static void main(String[] args) {
        UserDTO user = new UserDTO("John", "john@example.com", 25);
        System.out.println(user);

        // Изменение значения полей
        user.setUsername("Jane");
        user.setEmail("jane@example.com");
        user.setAge(30);
        System.out.println(user);
    }
}