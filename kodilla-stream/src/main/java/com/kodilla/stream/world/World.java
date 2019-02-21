package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {
    private final String worldName;
    private final List<Continent> continents = new ArrayList<>();

    public World(final String worldName) {
        this.worldName = worldName;
    }

    public void addContinent(Continent continent) {
        continents.add(continent);
    }

    public BigDecimal getPeopleQuantity() {
        return continents.stream()
                .flatMap(continent -> continent.getCountries().stream())
                //.map(country -> country.getPeopleQuantity())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, currentPeopleQuantity) -> sum = sum.add(currentPeopleQuantity));
    }

    public String getWorldName() {
        return worldName;
    }

    public List<Continent> getContinents() {
        return continents;
    }
}
