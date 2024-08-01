function solution(hp) {
    const ga = parseInt(hp / 5);
    const ba = parseInt((hp - (ga * 5)) / 3);
    const wa = parseInt((hp - (ga * 5) - (ba * 3)));
    
    return ga + ba + wa;
}