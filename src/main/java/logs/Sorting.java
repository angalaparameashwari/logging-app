package logs;

public class Sorting {

  public static void sort(Log[] logs){
        int noOfLogsToBeMerged = logs.length;
        Log log = mergeKLists(logs,noOfLogsToBeMerged-1);
        print(log);
    }

    public static Log mergeKLists(Log[] logs, int last)
    {
        while (last != 0) {
            int i = 0, j = last;
            while (i < j) {
                logs[i] = sortAndMerge(logs[i], logs[j]);
                i++;
                j--;
                if (i >= j) {
                    last = j;
                }
            }
        }

        return logs[0];
    }

    public static Log sortAndMerge(Log a, Log b)
    {
        Log result;
        if (a == null)
            return b;
        else if (b == null)
            return a;
        if (a.timeStamp <= b.timeStamp) {
            result = a;
            result.next = sortAndMerge(a.next, b);
        }
        else {
            result = b;
            result.next = sortAndMerge(a, b.next);
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
