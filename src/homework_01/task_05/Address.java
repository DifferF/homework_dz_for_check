package homework_01.task_05;

    /*
    Задание 5 +
    Используя IDEA, создайте проект c пакетом.
    Требуется: Создать класс с именем Address.
    В теле класса требуется создать поля: index, country, city, street, house, apartment.
    Для каждого поля, создать метод с двумя методами доступа (get, set)
    Создать экземпляр класса Address.
    В поля экземпляра записать информацию о почтовом адресе. Выведите на экран значения полей, описывающих адрес.
     */

public class Address {

    private int index;
    private String country;
    private String city;
    private String street;
    private int house;
    private int apartment;

    public Address (int indexC, String countryC, String cityC, String streetC, int houseC, int apartmentC ){
        this.index = indexC;
        this.country = countryC;
        this.city = cityC;
        this.street = streetC;
        this.house = houseC;
        this.apartment = apartmentC;
    }
    public void getDefault(){
        System.out.println("index - " + index + "\ncountry - " + country + "\ncity - " + city + "\nstreet - " + street + "\nhouse - " + house + "\napartment - " + apartment);
    }

    public void setIndex(int indexC){this.index = indexC;}
    public void getIndex(){System.out.println("index - " + index);}

    public void setCountry(String countryC){this.country = countryC;}
    public void getCountry(){System.out.println("country - " + country);}

    public void setCity(String cityC){this.city = cityC;}
    public void getCity(){System.out.println("city - " + city);}

    public void setStreet(String streetC){this.street = streetC;}
    public void getStreet(){System.out.println("street - " + street);}

    public void setHouse(int houseC){this.house = houseC;}
    public void getHouse(){System.out.println("house - " + house);}

    public void setApartment(int apartmentC){this.apartment = apartmentC;}
    public void getApartment(){System.out.println("apartment - " + apartment);}


    public static void main(String[] args) {
        System.out.println("Жил человек по адресу: ");
        Address addressO = new Address(49051,"Украина","Днепр","Европейская",34,30);
        addressO.getDefault();
        System.out.println("\nПришла война человек переехал: ");
        addressO.setIndex(78592);
        addressO.getIndex();
      //  addressO.setCountry("Украина");
        addressO.getCountry();
        addressO.setCity("Ворохта");
        addressO.getCity();
        addressO.setStreet("Михаила Грушевского");
        addressO.getStreet();
        addressO.setHouse(24);
        addressO.getHouse();
        addressO.setApartment(10);
        addressO.getApartment();
    }
}
