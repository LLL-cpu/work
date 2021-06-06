package cn.itcast;

import cn.itcast.Uilts.SqlUtil;
import cn.itcast.dao.Personnel_infoDao;
import cn.itcast.domain.Personnel_info;

/**
 * @author chnuo
 * @create 2021-01-13  20:33
 */
public class Worker {
    String Pno;

    @Override
    public String toString() {
        return "Worker{" +
                "Pno='" + Pno + '\'' +
                '}';
    }

    public String getPno() {
        return Pno;
    }

    public void setPno(String pno) {
        Pno = pno;
    }

    public Worker() {
    }

    public Worker(String pno) {
        Pno = pno;
    }

    public void choose(){
        SqlUtil sql = new SqlUtil();
        Personnel_infoDao mapper = (Personnel_infoDao) sql.getMapper(Personnel_infoDao.class);
        Personnel_info info = mapper.find(Pno);
        if("员工".equals(info.getINFO_JNAME())){
            new meun().pefess(Pno);
        }else {
            new meun().leader(Pno);
        }
        sql.close();
    }
}
