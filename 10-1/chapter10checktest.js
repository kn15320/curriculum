let numbers = [2, 5, 12, 13, 15, 18, 22];
//ここに答えを実装してください。↓↓↓
let even = numbers.filter(e => e % 2 === 0);

function isEven(num) {
    console.log(num + 'は偶数です');
}

isEven(even);

class Car {
    constructor(car_main, car_sub){
        this.car_main = car_main;
        this.car_sub = car_sub;
    }

    getNumGas(){
        console.log(`ガソリンは${this.car_main}です。ナンバーは${this.car_sub}です`)
    }
}

let gass = new Car("○○","△△");
gass.getNumGas();
