service Message {
   string motd();
   set<string> getNames1();
   set<string> (go.type = "slice") getNames2();
}

