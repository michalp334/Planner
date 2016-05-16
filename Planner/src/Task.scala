
class Task {
  
  var name:String=""
  var interval:Option[Interval]=None
    
  def modifyInterval(start:String, end:String) = interval = new Some(new Interval(start,end))  
   // in case interval wasn't specified by the user 
  }


