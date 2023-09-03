public class Main {
    public static void main(String[] args) {
        ToyShop shop = new ToyShop();
        
        shop.addToy(1, "Медведь", 15, 30);
        shop.addToy(2, "Заяц", 10, 25);
        shop.addToy(3, "Жираф", 20, 45);
        
        shop.setToyWeight(2, 30);
        
        shop.playTheGame();
        
        try {
            shop.getPrizeToy();
        }
