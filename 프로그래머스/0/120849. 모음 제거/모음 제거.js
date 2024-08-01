function solution(my_string) {
    var answer = '';
    
    answer = my_string.replaceAll(/[aeiou]/gi, "")
    return answer;
}