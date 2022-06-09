from car import Car
if __name__ == "__main__":
    print('hola mundo')
    car = Car()
    car.license = "SDF256"
    car.driver = "Andres Herrera"
    car.passengenger = 4
    print(vars(car))

    car2 = Car()
    car.license = "NJR247"
    car.driver = "Andrea Herrera"
    car.passengenger = 3
    print(vars(car))