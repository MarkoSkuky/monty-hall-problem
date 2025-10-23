import java.util.ArrayList;
import java.util.Random;

public class GameManager {

  private ArrayList<Door> doors = new ArrayList<>();
  private Random random = new Random();

  public GameManager() {
    int randomInt = random.nextInt(0, 3);

    for (int i = 0; i <= 2; i++) {
      doors.add(new Door());
      if (randomInt == i) {
        doors.get(i).setHasCar(true);
      }
    }
  }

  public ArrayList<Door> getDoors() {
    return new ArrayList<>(doors);
  }

  public void openDoor(int index) {
    doors.get(index).setOpen(true);
  }

  public void openAll() {
    for (Door door : doors) {
      door.setOpen(true);
    }
  }
}
