from typing import List

from pydantic import BaseModel

from models.Car import Car

NEWLINE = "\n"


class RentCompany(BaseModel):
    cars: List[Car] = []

    def add_car(self, Car):
        self.cars.append(Car)

    def generate_report(self):
        report_each = [x.report() for x in self.cars]
        return NEWLINE.join(report_each)
