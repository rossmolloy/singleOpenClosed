package ie.gmit.single;

public class StoreUser {

    private Store store = new Store();

    public boolean storeUserDetails(User user) {
        return storeValidUser(user);
    }

    private boolean storeValidUser(User user) {
        store.store(user);
        return true;
    }
}
