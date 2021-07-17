from models.RentCompany import RentCompany
from models.Car import *

NEWLINE = "\n"


def test_report(rent_company: RentCompany):
    rent_company.add_car(Sonata(trip_distance=150))
    rent_company.add_car(K5(trip_distance=260))
    rent_company.add_car(Sonata(trip_distance=120))
    rent_company.add_car(Avante(trip_distance=300))
    rent_company.add_car(K5(trip_distance=390))

    report = rent_company.generate_report();
    assert report == "Sonata : 15리터" + NEWLINE + \
           "K5 : 20리터" + NEWLINE + \
           "Sonata : 12리터" + NEWLINE + \
           "Avante : 20리터" + NEWLINE + \
           "K5 : 30리터" + NEWLINE
