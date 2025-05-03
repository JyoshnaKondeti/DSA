function reverseString(str){
    let reversed = "";
    for(i=str.length-1; i>=0; i--){
        reversed += str[i];
    }
    return reversed;
}
console.log(reverseString("Hello"));


// git init
// git add .
// git commit -m "Add initial code"
// git remote add origin https://github.com/your-username/your-repo-name.git 
// https://github.com/JyoshnaKondeti/DSA.git 
// git branch -M main
// git push -u origin main