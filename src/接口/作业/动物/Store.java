package 接口.作业.动物;

public class Store {

    public Animal get (String choice){
        if (choice.equals("cat")){
            return new Cat();
        }else if (choice.equals("dog")){
            return new Dog();
        }else if (choice.equals("pig")){
            return new Pig();
        }
        return null;
    }
}
