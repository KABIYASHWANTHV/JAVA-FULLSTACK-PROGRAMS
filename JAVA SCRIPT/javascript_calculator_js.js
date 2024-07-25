function display(value)
{
    document.getElementById("disp").value+=value;
}
function clearDisplay()
{
    document.getElementById("disp").value="";  
}
function calculate()
{
    var x=document.getElementById("disp").value;
    var y=eval(x);
    document.getElementById("disp").value=y;
}
function del()
{
    var x=document.getElementById("disp").value;
    document.getElementById("disp").value=x.slice(0,-1);
}