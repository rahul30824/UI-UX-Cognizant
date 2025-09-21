<html>
<head>
<style>
body
  {
    display:flex;
    justify-content:center;
    display-flex:column;
    height:100vh;
  }
.box
  {
    height:100px;
    width:100px;
    border:2px solid black;
  }
.btn
  {
    margin-top:20px;
  }
</style>
  </head>
  <body>
   
    <div class="container">
      <h1 id="head">counter :<span id="counter">0</span></h1>//we are picking the counter id because we need to influence counter//
<div class="btn">
      <button onclick="increment()">+</button>
       <button onclick="decrement()">-</button>
        <button onclick="reset()">Reset</button>
</div>
</div>
<script>
let count=0;
function increment()
  {
    let el=document.getElementById("counter");
   el.textContent = count;
    count++;
  }
function decrement()
  {
    let el=document.getElementById("counter");
    el.textContent = count;
  count--;
  }
function reset() {
  count = 0;
  let el=document.getElementById("counter");
el.textContent = count;
}
  
</script>
</body>
</html>
