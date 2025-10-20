let x=[1,2,3,4,7];
x.forEach(f1);

function f1(element){
    console.log(element);
    x.forEach(f);
//callback();
}
function f(element)
{
    console.log(element);
}