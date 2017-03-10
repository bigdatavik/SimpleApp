

import org.apache.spark.SparkContext, org.apache.spark.SparkConf
import com.typesafe.config._

object SimpleApp {
  def main(args: Array[String]) {
    val appConf = ConfigFactory.load()
    val conf = new SparkConf().setAppName("scala spark").setMaster(args(0))
    val sc = new SparkContext(conf)
    val i = List(1, 2, 3, 4, 5)
    val dataRDD = sc.parallelize(i)
    dataRDD.saveAsTextFile(appConf.getString(args(1)))
     //dataRDD.saveAsTextFile(appConf.getString("outputFolder"))
     
  }
     
   
 
}
