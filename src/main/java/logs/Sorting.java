package logs;

public class Sorting {

  public static void sort(Log[] logs){
        int noOfLogsToBeMerged = logs.length;
        Log log = mergeKLists(logs,noOfLogsToBeMerged-1);
        print(log);
    }

    public static Log mergeKLists(Log[] logs, int lastInTheList)
    {
        while (lastInTheList != 0) {
            int i = 0, j = lastInTheList;
            while (i < j) {
                logs[i] = sortAndMerge(logs[i], logs[j]);
                i++;
                j--;
                if (i >= j) {
                    lastInTheList = j;
                }
            }
        }

        return logs[0];
    }

    public static Log sortAndMerge(Log item1, Log item2)
    {
        Log result;
        if (item1 == null)
            return item2;
        else if (item2 == null)
            return item1;
        if (item1.timeStamp <= item2.timeStamp) {
            result = item1;
            result.next = sortAndMerge(item1.next, item2);
        }
        else {
            result = item2;
            result.next = sortAndMerge(item1, item2.next);
        }

        return result;
    }


    public static void print(Log log)
    {
        while (log != null) {
            System.out.println(log.logInfo);
            log = log.next;
        }
    }
}
