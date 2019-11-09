package com.company;

public class magicDoor {

    public Hero[] heroes() {
        Hero c1 = new Hero(250, 20, "physical");
        Hero c2 = new Hero(250, 20, "magical");
        Hero c3 = new Hero(250, 20, "kinetic");
        Hero c4 = new Hero(250, 0, "medical");
        Hero [] heroes={c1,c2,c3,c4};
        return heroes;
    }


}


