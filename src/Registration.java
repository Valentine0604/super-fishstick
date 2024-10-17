public class Registration {
    private String catName;
    private String catFavouriteToy;
    private String catAge;
    private String catBreed;
    private String catOwnerName;

    public Registration(String catName, String catFavouriteToy, String catAge, String catBreed, String catOwnerName) {
        this.catName = catName;
        this.catFavouriteToy = catFavouriteToy;
        this.catAge = catAge;
        this.catBreed = catBreed;
        this.catOwnerName = catOwnerName;
    }

    public String getCatName() {
        return catName;
    }
}
