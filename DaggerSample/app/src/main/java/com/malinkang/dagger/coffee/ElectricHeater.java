package com.malinkang.dagger.coffee;

import android.util.Log;

class ElectricHeater implements Heater {
  boolean heating;

  @Override public void on() {
      Log.d("Dagger", "~ ~ ~ heating ~ ~ ~");
      this.heating = true;
  }

  @Override public void off() {
    this.heating = false;
  }

  @Override public boolean isHot() {
    return heating;
  }
}
