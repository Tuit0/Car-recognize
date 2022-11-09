package uz.ogabek_dev;

import java.util.List;

public class CreatureService {

    public CarModel findSimilarClass(String buying,
                                     String maint,
                                     String doors,
                                     String persons,
                                     String lugBoot,
                                     String safety,
                                     List<CarModel> dataset) {

        return dataset
                .stream()
                .filter(carModel -> carModel.getBuying().equals(buying))
                .filter(carModel -> carModel.getMaint().equals(maint))
                .filter(carModel -> carModel.getDoors().equals(doors))
                .filter(carModel -> carModel.getPersons().equals(persons))
                .filter(carModel -> carModel.getLugBoot().equals(lugBoot))
                .filter(carModel -> carModel.getSafety().equals(safety))
                .findAny()
                .orElseGet(() -> dataset.get((int) (Math.random() * 1000)));

//        return classes
//                .stream()
//                .peek(
//                        carType -> {
//                            List<Car> cars = datacenter.stream()
//                                    .filter(car -> car.getK() == carType)
//                                    .toList();
//
//                            List<Integer> ageRate = cars.stream().map(Car::getBuying).map(Rate::getValue).toList();
//                            List<Integer> heightRate = cars.stream().map(Car::getMaint).map(Rate::getValue).toList();
//                            List<Integer> weightRate = cars.stream().map(Car::getDoors).map(Rate::getValue).toList();
//
//                            double epsilonAge = (Collections.max(ageRate) - Collections.min(ageRate)) / 2.0;
//                            double epsilonHeight = (Collections.max(heightRate) - Collections.min(heightRate)) / 2.0;
//                            double epsilonWeight = (Collections.max(weightRate) - Collections.min(weightRate)) / 2.0;
//
//                            carType.setEpsilonAge(epsilonAge);
//                            carType.setEpsilonHeight(epsilonHeight);
//                            carType.setEpsilonWeight(epsilonWeight);
//
//                            cars.forEach(car -> {
//                                car.setBuying(
//                                        new Rate(car.getBuying().getValue(),
//                                                Math.abs(car.getBuying().getValue() - age) < epsilonAge ? 0 : 1));
//                                car.setMaint(
//                                        new Rate(car.getMaint().getValue(),
//                                                Math.abs(car.getMaint().getValue() - height) < epsilonHeight ? 0 : 1));
//                                car.setDoors(
//                                        new Rate(car.getDoors().getValue(),
//                                                Math.abs(car.getDoors().getValue() - weight) < epsilonWeight ? 0 : 1));
//                            });
//
//                            int maxCount = cars.stream().map(o1 ->
//                                            o1.getBuying().getIsSimilar() +
//                                                    o1.getDoors().getIsSimilar() +
//                                                    o1.getDoors().getIsSimilar())
//                                    .flatMapToInt(IntStream::of)
//                                    .sum();
//                            carType.setMaxCount(maxCount);
//                        })
//                .max(Comparator.comparing(CarType::getMaxCount));
    }
}
