var bttn=document.getElementById("bttn");
var dat=document.getElementById("data");


bttn.addEventListener("click",function()
{
    var Request=new XMLHttpRequest();
    Request.open('GET','https://learnwebcode.github.io/json-example/animals-1.json');
    Request.onload=function()
                      {
                        var reqdata=Request.responseText;
                        var mydata=JSON.parse(Request.responseText);
                        // console.log(reqdata);
                        for(i=0;i<mydata.length;i++)
                        {
                            let str=mydata[i].name+" is a "+mydata[i].species+" who likes to eat ";
                            for (var j=0;j<mydata[i].foods.likes.length;j++)
                            {
                                str+=mydata[i].foods.likes[j]+" and ";
                            }
                            str+="their dislikes include ";
                            for(var k=0;k<mydata[i].foods.dislikes.length;k++)
                            {
                                if(mydata[i].foods.dislikes.length-1==k)
                                {
                                    str+=mydata[i].foods.dislikes[k];
                                }
                                else
                                {
                                    str+=mydata[i].foods.dislikes[k]+" and ";
                                }
                                
                            }
                            str+=".<br>";
                            dat.insertAdjacentHTML("afterbegin",str);   
                        }
                    }
    Request.send();
});