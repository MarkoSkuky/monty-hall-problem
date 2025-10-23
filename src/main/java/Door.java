public class Door {

  private boolean hasCar = false;
  private boolean isOpen = false;

  public Door() {

  }

  public boolean isHasCar() {
    return hasCar;
  }

  public void setHasCar(boolean hasCar) {
    this.hasCar = hasCar;
  }

  public void setOpen(boolean open) {
    isOpen = open;
  }

  @Override
  public String toString() {
    if (isOpen) {
      if (this.hasCar) {
        return "Car";
      } else {
        return "Goat";
      }
    } else {
      return "Door";
    }
  }
}
