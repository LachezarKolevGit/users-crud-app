package bg.proxiad.demo;

public class User {
    private static long userId = 0;

    private final Long id;
    private String name;

    public User(String name) {
        userId++;
        this.id = userId;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId() {
       if(this.id != null){
           throw new IllegalArgumentException("User's id can't be changed");
       }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "id=" + id + ", name='" + name + '\'';

    }
}
