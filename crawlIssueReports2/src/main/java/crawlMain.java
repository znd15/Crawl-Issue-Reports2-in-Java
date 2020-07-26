import java.util.ArrayList;
import java.util.List;

public class crawlMain {
    public static void main( String[] args ) throws InterruptedException
    {
        Crawler crawl = new Crawler();
        List<Issue> issues = new ArrayList();
        for(int id=10597; id< 10625; id++){
            try{
                Issue issue =  crawl.CrawlIssueReport(id);
                issues.add(issue);
            } catch(Exception e) {}
        }
        crawl.WritingDataToCSV(issues);
    }
}