package videos.interediate.pulin.arac.chapter_2._1design.an.interfaces1;

import java.util.List;

public interface RaceManager {
    public Animal gerWinner(List<Animal> animals);
}

class DummyRaceManager implements RaceManager{
    @Override
    public Animal gerWinner(List<Animal> animals) {
        return animals == null || animals.size() == 0? null:animals.get(0);
    }
}
