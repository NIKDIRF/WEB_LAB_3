function check(x, y, r){
    return checkX(x) && checkY(y) && checkR(r)
}

function checkX(x){
    if (x === "") {
        alert("Enter the X value")
        return false
    }
    if (!isFinite(x)) {
        alert("X must be a number")
        return false;
    }
    if (x <= -2 || x >= 1) {
        alert("X value must be in {-2, -1.5, -1, 0, 0.5, 1}")
        return false;
    }
    return true;
}

function checkY(y){
    if (y === "") {
        alert("Enter the Y value")
        return false
    }
    if (!isFinite(y)) {
        alert("Y must be a number")
        return false;
    }
    if (y <= -5 || y >= 5) {
        alert("Y value must be in range (-5; 5)")
        return false;
    }
    return true;
}

function checkR(r){
    console.log(r)
    if (r === "") {
        alert("Select the R value")
        return false
    }
    if (r < 1 || r > 3) {
        alert("R value must be in {1, 1.5, 2, 2.5, 3}")
        return false;
    }
    return true;
}
