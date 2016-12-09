import java.util.Date

import org.apache.commons.lang3.time.{DateFormatUtils, DateUtils}

object DateUtil {
    def now() = new Date

    def days(d: Date, diff: Int) = DateUtils.addDays(d, diff)

    def seconds(d: Date, diff: Int) = DateUtils.addSeconds(d, diff)

    def minutes(d: Date, diff: Int) = DateUtils.addMinutes(d, diff)

    def hours(d: Date, diff: Int) = DateUtils.addHours(d, diff)

    def format(d: Date, fmt: String) = DateFormatUtils.format(d, fmt)

    def string(d : Date) = DateFormatUtils.format(d, "yyyy-MM-dd HH:mm:ss")

    def main(args: Array[String]): Unit = {
        println(now())
        println(days(now(), 1))
        println(format(now(), "yyyy-MM-dd"))
        println(string(now()))
    }
}
