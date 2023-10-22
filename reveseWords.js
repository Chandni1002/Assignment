 function reverseWords(input) {
    let words = input.split(' ');
    let reversedWords = words.map(word => {
        return word.split('').reverse().join('');
    });
    let output = reversedWords.join(' ');

    return output;
}
let input = "This is a sunny day";
let output = reverseWords(input);
console.log("Input: " + input);
console.log("Output: " + output);
