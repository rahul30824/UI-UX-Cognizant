<html>
<head>
<style>
body
  {
    display:flex;
    align-items:center;
    justify-content:center;
 height :100vh;
   
  }
.box
  {
    height:300px;
    width:300px;
    border:2px solid black;
    display:flex;
   flex-direction:column;
  }
.container h1
  {
    margin-left:110px;
  }
.container label
  {
    margin-left:40px;
   margin-top:20px;
  }
.container input
  {
    margin-left:40px;
   width:200px;
    
  }
.btn
  {
    border-radius:20px;
    background-color:#90EE90;
    margin-top:70px;
    width:150px;
    margin-left:70px;
  }
</style>
  </head>
<body>
<div class="container">
<form id="formid">
 <div class="box">
<h1>Login</h1>
<label>RegNo</label>
<input  id="regno"type="text">
<label>Password</label>
<input id="password" type="password">
   <button type="submit" class="btn">Submit</button>
</div>
  </form>
<p id="message"></p>
 </div>
<script>
const formelement=document.getElementById("formid");
const message = document.getElementById("message");

const testregno="192210684";
const testpassword="Ragul@2004";
 
formelement.addEventListener("submit",function(event)
                             {
 event.preventDefault();
 const regno=document.getElementById("regno").value;
  const password=document.getElementById("password").value;

if(regno==testregno && password==testpassword)
  {
  message.style.color="green";
  message.textContent="Login Successfull";
}
  else
    {
       message.style.color="red";
  message.textContent="Login failed";
    }
});
 </script>
 </body>
</html>
