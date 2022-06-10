from car import Car
from account import Account

if __name__ == "__main__":
    print('hola mundo')
    car = Car("AFG358",Account("Andres Herrera","AS12356"))
    print(vars(car))
    print(vars(car.driver))











    # car = Car()
    # car.license = "SDF256"
    # car.driver = "Andres Herrera"
    # car.passengenger = 4
    # print(vars(car))

    # car2 = Car()
    # car.license = "NJR247"
    # car.driver = "Andrea Herrera"
    # car.passengenger = 3
    # print(vars(car))