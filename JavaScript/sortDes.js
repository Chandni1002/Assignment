function arrSort(arr) {
    arr.sort((a, b) => a - b);
    arr.reverse();
    return arr;
}

function main() {
    let numbers = [1,2,3,4,5,6,7];
    console.log("Original Array: " + numbers.join(", "));
    
    let sortedArray = arrSort(numbers);
    console.log("Sorted and Reversed Array: " + sortedArray.join(", "));
}

main(); 

