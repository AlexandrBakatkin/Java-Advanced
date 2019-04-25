public class Course {
    private Obstacle course [];

    public Course(Obstacle... obstacles) {
        this.course = obstacles;
    }

    public void doIt (Team team){
        Competitor [] tempTeam = team.getTeam();
        team.setStart(true);
        for (Competitor competitor : tempTeam) {
            for (Obstacle obstacle : course) {
                obstacle.doIt(competitor);
                if (!competitor.isOnDistance()) break;
            }
        }
    }
}