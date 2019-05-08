public class Main {
    public static void main(String[] args) {

        Team team = new Team("Динамо", new Dog ("Bim"), new Cat ("Barsik"), new Human("Alex"));
        Course course = new Course(new Cross(200), new Water (2), new Wall(3));

        team.teamInfo();        //общая информация о команде
        System.out.println("____________________");
        course.doIt(team);      //команда проходит полосу препятствий
        System.out.println("____________________");
        team.showResult();      //результаты прохождения всех участников команды
        System.out.println("____________________");
        team.winCompetitor();   //участники, которые прошли полосу препятствий
    }
}