from pydantic import BaseModel
from abc import *


class Car(BaseModel, ABC):
    distance_per_liter: int
    trip_distance: int

    @abstractmethod
    def get_distance_per_liter(self):
        pass

    @abstractmethod
    def get_trip_distance(self):
        pass

    @abstractmethod
    def get_name(self):
        pass

    def get_charge_quantity(self):
        return self.get_trip_distance() / self.get_distance_per_liter()

    def report(self):
        return f"{self.get_name()} : {self.get_charge_quantity()}"


class Sonata(Car):
    distance_per_liter = 10

    def get_distance_per_liter(self):
        return self.distance_per_liter

    def get_trip_distance(self):
        return self.trip_distance

    def get_name(self):
        return "Sonata"


class Avante(Car):
    distance_per_liter = 15

    def get_distance_per_liter(self):
        return self.distance_per_liter

    def get_trip_distance(self):
        return self.trip_distance

    def get_name(self):
        return "Avante"


class K5(Car):
    distance_per_liter = 13

    def get_distance_per_liter(self):
        return self.distance_per_liter

    def get_trip_distance(self):
        return self.trip_distance

    def get_name(self):
        return "K5"
