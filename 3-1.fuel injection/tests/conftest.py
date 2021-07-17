import pytest

from models.RentCompany import RentCompany


@pytest.fixture
def rent_company():
    rent_company = RentCompany()
    return rent_company
