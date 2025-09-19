<html>
<head>
 </head>
<body>
 <h1> Counter<span id="counter">0</span></h1>
  <button onclick="increase()">+</button>
  <button onclick="decrease()">-</button>
  <button onclick="Reset()">Reset</button>
<script>
let count=0;
let counterelement=document.getElementById("counter");
function increase()
  {
    count++;
     counterelement.textContent = count;
  }
function decrease()
  {
    count--;
 counterelement.textContent = count;
  }
  </script>
  </body>
</html>\
