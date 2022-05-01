package study.datajpa.repository;

/**
 * Created by sskim on 2022/05/01
 * Github : http://github.com/sskim91
 */
public interface NestedClosedProjections {

    String getUsername();
    TeamInfo getTeam();

    interface TeamInfo {
        String getName();
    }
}
