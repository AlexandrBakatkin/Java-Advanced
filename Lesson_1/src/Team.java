public class Team {
    private String name;
    private Competitor [] team;
    private boolean start;                  //Для проверки - проходила ли команда полосу препятствий хоть один раз

    public Team(String name, Competitor ... competitor) {
        this.name = name;
        this.start = false;
        this.team = competitor;
    }

    public void showResult (){
        for (Competitor t : team) {
            System.out.println("Прошел " + t.getType() + " " + t.getName() + " препятствия? " + t.showResult());
        }
    }

    public void teamInfo (){
        System.out.println("В команде " + name + " следующие участники: ");
        for (Competitor c : team) {
            System.out.println(c.getType() + " " + c.getName());
        }
        if (start == false){
            System.out.println("Команда еще не проходила полосу препятствий");
        } else {
            System.out.println("Команда пыталась пройти дистанцию");
            for (Competitor c : team) {
                System.out.println(c.getType() + " " + c.getName() + " прошел полосу препятствий? " + c.showResult());
            }
        }
    }

    public void setStart(boolean start) {
        this.start = start;
    }

    public Competitor[] getTeam() {
        return team;
    }

    public void winCompetitor (){
        for (Competitor competitor : team) {
            if (competitor.isOnDistance() == true){
                System.out.println(competitor.getType() + " " + competitor.getName() + " прошел дистанцию");
            }
        }
    }
}