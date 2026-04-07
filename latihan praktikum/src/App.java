import game.Hero;
import game.HeroStrength;

public class App {
    public static void main(String[] args) throws Exception {
        Hero hero1 = new Hero("BoboiBoy", 100, 20);
        hero1.display();

        HeroStrength hero2 = new HeroStrength("Adudu", 120, 25);
        hero2.display();

        hero1.berlatih();
        hero1.display();

        hero2.berlatih();
        hero2.display();

        hero1.terimaSerangan(50);
        hero2.terimaSerangan(50);
        
        hero1.display();
        hero2.display();

    }
}
